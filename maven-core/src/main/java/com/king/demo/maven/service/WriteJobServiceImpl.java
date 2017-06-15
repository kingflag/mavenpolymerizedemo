package com.king.demo.maven.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.king.demo.maven.dao.IWriteJobDao;


public class WriteJobServiceImpl implements IWriteJobService {

  @Autowired
  private IWriteJobDao writeJobDaoImpl;  
  
  @Override
  public String insert() throws Exception {
    writeJobDaoImpl.insert();
    return "ServiceTestinsert";
  }

}
