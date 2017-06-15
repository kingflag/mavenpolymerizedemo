package com.king.demo.maven.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class WriteJobDaoImpl implements IWriteJobDao {

  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public String insert() throws Exception {
    System.out.println("daoc============+++++++");

    /* 测试数据库连接信息 */
    // DatabaseMetaData md =
    // this.jdbcTemplate.getDataSource().getConnection().getMetaData();
    // System.out.println(md.getDatabaseProductName());
    // System.out.println(md.getDatabaseProductVersion());
    UUID uuid = UUID.randomUUID();

    Random r = new Random();
    float surplus = r.nextInt(12365);

    String sql = "insert into hduserinfo (user,surplus,createtime) values (uuid,'65.6','2017-06-21 11:02:59')";
    System.out.println(sql);
    int temp = jdbcTemplate.update("insert into hduserinfo (user,surplus,createtime) values ('"
        + uuid + "','" + surplus + "','" + dateToString(new Date()) + "')");
    System.out.println("插入成功：" + String.valueOf(temp));
    return null;
  }

  private static String dateToString(Date time) {
    SimpleDateFormat formatter;
    formatter = new SimpleDateFormat("yyyy-MM-dd KK:mm:ss");
    String ctime = formatter.format(time);

    return ctime;
  }

}
