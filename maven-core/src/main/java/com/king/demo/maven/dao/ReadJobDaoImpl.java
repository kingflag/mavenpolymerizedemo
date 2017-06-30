package com.king.demo.maven.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.king.demo.maven.domain.HdUserinfo;

public class ReadJobDaoImpl implements IReadJobDao {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public List<HdUserinfo> selectall() throws Exception {
    System.out.println("测试连接");

    /* 测试数据库连接信息 */
    // DatabaseMetaData md =
    // this.jdbcTemplate.getDataSource().getConnection().getMetaData();
    // System.out.println(md.getDatabaseProductName());
    // System.out.println(md.getDatabaseProductVersion());

    final String ID = "id";
    final String USER = "user";
    final String SURPLUS = "surplus";
    // private final Date CREATETIME = "createtime";

    String sql = "select * from HdUserinfo ";
    return jdbcTemplate.query(sql, new BeanPropertyRowMapper(HdUserinfo.class));
  }

  @Override
  public HdUserinfo getone(String id) throws Exception {
    String sql = "select * from HdUserinfo  where ID =" + id;
    return jdbcTemplate.query(sql, new ResultSetExtractor<HdUserinfo>() {

      @Override
      public HdUserinfo extractData(ResultSet rs) {
        System.out.println(rs.toString());
        try {
          if (rs.next()) {
            HdUserinfo contact = new HdUserinfo();
            contact.setId(rs.getInt("id"));
            contact.setUser(rs.getString("user"));
            contact.setSurplus(rs.getString("surplus"));
            contact.setCreatetime(rs.getDate("createtime"));
            return contact;
          }
          return null;
        } catch (Exception e) {
          e.printStackTrace();
        }
        return null;
      }

    });

  }

  @Override
  public int delete(String id) throws Exception {
    String sql = "delete from HdUserinfo where ID ==?";
    Object args[] = new Object[]{id};
    int result = jdbcTemplate.update(sql,args);
    return result;
  }

  @Override
  public int save(HdUserinfo user) throws Exception {
    String sql = "insert into HdUserinfo(user,surplus,createtime)values(?,?,?)";
    Object args[] = {
        user.getUser(), user.getSurplus(), user.getCreatetime() };
    int result = jdbcTemplate.update(sql, args);
    if (result > 0) {
      System.out.println("插入成功");
    } else {
      System.out.println("插入失败");
    }
    return result;
  }

  @Override
  public int update(HdUserinfo user) throws Exception {
    String sql = "update HdUserinfo set user=?,surplus=?,createtime=? where id=" + user.getId();
    Object args[] = { user.getUser(), user.getSurplus(), user.getCreatetime() };
    int result = jdbcTemplate.update(sql, args);
    if (result > 0) {
      System.out.println("修改成功");
    } else {
      System.out.println("修改失败");
    }
    return result;
  }

}
