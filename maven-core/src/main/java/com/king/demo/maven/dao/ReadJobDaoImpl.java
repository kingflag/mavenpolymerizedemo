package com.king.demo.maven.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

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
  //    DatabaseMetaData md = this.jdbcTemplate.getDataSource().getConnection().getMetaData();
  //    System.out.println(md.getDatabaseProductName());
  //    System.out.println(md.getDatabaseProductVersion());
      
      final String ID = "id";
      final String USER = "user";
      final String SURPLUS = "surplus";
      //private final Date CREATETIME = "createtime"; 

      String sql = "select * from HdUserinfo "; 
      return jdbcTemplate.query(sql, new BeanPropertyRowMapper(HdUserinfo.class));
  }

  @Override
  public int delete(String id) throws Exception {
    String sql = "delete from HdUserinfo where ID ="+id; 
    int result = jdbcTemplate.update(sql);
    return result;
  }

  @Override
  public int save(HdUserinfo user) throws Exception {
    String sql = "insert into user(username,password,email)values(?,?,?)";  
    Object args[] = {user.getId(),user.getUser(),user.getSurplus(),user.getCreatetime()};  
    int result = jdbcTemplate.update(sql, args);
    if (result>0) {
        System.out.println("插入成功");
    } else {
        System.out.println("插入失败");
    }
    return result;
  }
  
  
}
