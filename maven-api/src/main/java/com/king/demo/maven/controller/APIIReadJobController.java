package com.king.demo.maven.controller;

import java.util.List;

import com.king.demo.maven.APIdomain.APIHdUserinfo;

public interface APIIReadJobController {
  
  public List<APIHdUserinfo> selectall() throws Exception;
  
  public int delete(String id) throws Exception;
  
  public int save(APIHdUserinfo user) throws Exception;

}
