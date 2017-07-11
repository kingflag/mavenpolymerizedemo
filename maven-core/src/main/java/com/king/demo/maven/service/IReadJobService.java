package com.king.demo.maven.service;

import java.util.List;

import com.king.demo.maven.domain.HdUserinfo;

public interface IReadJobService {

  public List<HdUserinfo> selectall() throws Exception;
  
  public HdUserinfo getone(String id) throws Exception;
  
  public int delete(String id) throws Exception;
  
  public int save(HdUserinfo user) throws Exception;

  public int update(HdUserinfo user)throws Exception;
  
  
  
  public List<HdUserinfo> hbselectall() throws Exception;
  
  public HdUserinfo hbgetone(String id) throws Exception;
  
  public int hbdelete(String id) throws Exception;
  
  public int hbsave(HdUserinfo user) throws Exception;

  public int hbupdate(HdUserinfo user)throws Exception;
}
