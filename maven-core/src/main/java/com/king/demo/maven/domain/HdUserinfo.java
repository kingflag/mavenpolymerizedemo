package com.king.demo.maven.domain;

import java.io.Serializable;
import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;


//@Entity
//@Table(name = HdUserinfo.TABLE_NAME)
public class HdUserinfo implements Serializable  {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /** 数据库表名称。 */
  public static final String TABLE_NAME = "hdUserinfo";

  private int id;
  private String user;
  private String surplus;
  private Date createtime;

//  @Id
//  @Column(name = "id")
//  @GeneratedValue(strategy=GenerationType.AUTO)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  //@Column(name = "user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  //@Column(name = "surplus")
  public String getSurplus() {
    return surplus;
  }

  public void setSurplus(String surplus) {
    this.surplus = surplus;
  }

  //@Column(name = "surplus")
  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  @Override
  public String toString() {
    return "HdUserinfo [id=" + id + ", user=" + user + ", surplus=" + surplus + ", createtime="
        + createtime + "]";
  }

}
