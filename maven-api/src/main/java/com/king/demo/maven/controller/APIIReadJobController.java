package com.king.demo.maven.controller;

import java.util.List;

import com.king.demo.maven.APIdomain.APIHdUserinfo;

public interface APIIReadJobController {
  
  public List<APIHdUserinfo> selectall() throws Exception;
  
  public APIHdUserinfo getone(String id) throws Exception;
  
  public int delete(String id) throws Exception;
  
  public int save(APIHdUserinfo user) throws Exception;

  public int update(APIHdUserinfo user) throws Exception;
}
