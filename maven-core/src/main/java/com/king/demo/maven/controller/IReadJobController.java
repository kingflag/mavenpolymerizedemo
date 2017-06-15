package com.king.demo.maven.controller;

import java.util.List;

import com.king.demo.maven.domain.HdUserinfo;


public interface IReadJobController {
  
  public List<HdUserinfo> selectall() throws Exception;

}
