package com.king.demo.maven.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.king.demo.maven.domain.HdUserinfo;
import com.king.demo.maven.service.IReadJobService;

public class ReadJobControllerImpl implements IReadJobController {

  @Autowired
  private IReadJobService readJobServiceImpl;
  
  @Override
  public List<HdUserinfo> selectall() throws Exception {
    List<HdUserinfo> result = new ArrayList<HdUserinfo>();
    result = readJobServiceImpl.selectall();
    System.out.println("selectAll");
    return result;
    
  }

}
