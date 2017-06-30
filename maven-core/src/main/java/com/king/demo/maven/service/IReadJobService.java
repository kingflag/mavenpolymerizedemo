package com.king.demo.maven.service;

import java.util.List;

import com.king.demo.maven.domain.HdUserinfo;

public interface IReadJobService {

  public List<HdUserinfo> selectall() throws Exception;
  
  public HdUserinfo getone(String id) throws Exception;
  
  public int delete(String id) throws Exception;
  
  public int save(HdUserinfo user) throws Exception;

  public int update(HdUserinfo user)throws Exception;
}
