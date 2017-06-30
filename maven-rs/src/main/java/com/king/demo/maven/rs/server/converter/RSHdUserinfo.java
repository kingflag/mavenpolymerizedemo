package com.king.demo.maven.rs.server.converter;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RSHdUserinfo")
public class RSHdUserinfo {

  private int id;
  private String user;
  private String surplus;
  private Date createtime;

  @XmlElement(required = false)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @XmlElement(required = true)
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @XmlElement(required = true)
  public String getSurplus() {
    return surplus;
  }

  public void setSurplus(String surplus) {
    this.surplus = surplus;
  }

  @XmlElement(required = true)
  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  @Override
  public String toString() {
    return "RSHdUserinfo [id=" + id + ", user=" + user + ", surplus=" + surplus + ", createtime="
        + createtime + "]";
  }

}
