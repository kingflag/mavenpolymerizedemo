package com.king.demo.maven.domain;

import java.util.Date;

public class HdUserinfo {

  private int id;
  private String user;
  private String surplus;
  private Date createtime;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getSurplus() {
    return surplus;
  }

  public void setSurplus(String surplus) {
    this.surplus = surplus;
  }

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
