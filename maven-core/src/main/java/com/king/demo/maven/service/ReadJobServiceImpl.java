package com.king.demo.maven.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.king.demo.maven.dao.IReadJobDao;
import com.king.demo.maven.domain.HdUserinfo;


public class ReadJobServiceImpl implements IReadJobService {

  @Autowired
  private IReadJobDao readJobDaoImpl;  
  
  @Override
  public List<HdUserinfo> selectall() throws Exception {
    List<HdUserinfo> result = new ArrayList<HdUserinfo>();
    System.out.println("readJobDaoImpl的selectall");
    System.out.println("查询到："+readJobDaoImpl.selectall());
    result = readJobDaoImpl.selectall();
    return result;
  }

}
