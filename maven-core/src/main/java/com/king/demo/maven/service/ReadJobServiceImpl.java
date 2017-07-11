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
    System.out.println("查询到：" + readJobDaoImpl.selectall());
    result = readJobDaoImpl.selectall();
    return result;
  }

  @Override
  public HdUserinfo getone(String id) throws Exception {
    HdUserinfo result = new HdUserinfo();
    result = readJobDaoImpl.getone(id);
    return result;

  }

  @Override
  public int delete(String id) throws Exception {
    int result = readJobDaoImpl.delete(id);
    return result;
  }

  @Override
  public int save(HdUserinfo user) throws Exception {
    int result = readJobDaoImpl.save(user);
    return result;
  }

  @Override
  public int update(HdUserinfo user) throws Exception {
    int result = readJobDaoImpl.update(user);
    return result;
  }

  @Override
  public List<HdUserinfo> hbselectall() throws Exception {
    List<HdUserinfo> result = new ArrayList<HdUserinfo>();
    System.out.println("hibernate查询到：" + readJobDaoImpl.hbselectall());
    result = readJobDaoImpl.hbselectall();
    return result;
  }

  @Override
  public HdUserinfo hbgetone(String id) throws Exception {
    HdUserinfo result = new HdUserinfo();
    result = readJobDaoImpl.hbgetone(id);
    return result;

  }

  @Override
  public int hbdelete(String id) throws Exception {
    int result = readJobDaoImpl.hbdelete(id);
    return result;
  }

  @Override
  public int hbsave(HdUserinfo user) throws Exception {
    int result = readJobDaoImpl.hbsave(user);
    return result;
  }

  @Override
  public int hbupdate(HdUserinfo user) throws Exception {
    int result = readJobDaoImpl.hbupdate(user);
    return result;
  }

}
