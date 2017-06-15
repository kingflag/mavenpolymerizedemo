package com.king.demo.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.king.demo.maven.service.IWriteJobService;

/**
 * 
 * @author wangguoqi
 *
 */
public class WriteJobControllerImpl implements IWriteJobController {

  @Autowired
  private IWriteJobService writeJobServiceImpl;

  @Override
  public void insert() throws Exception{
    System.out.println("插入过程");
    writeJobServiceImpl.insert();
  }

}
