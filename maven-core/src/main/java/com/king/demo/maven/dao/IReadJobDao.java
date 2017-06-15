package com.king.demo.maven.dao;

import java.util.List;

import com.king.demo.maven.domain.HdUserinfo;

public interface IReadJobDao {
  public List<HdUserinfo> selectall() throws Exception;

}
