package com.king.demo.maven.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.king.demo.maven.APIdomain.APIHdUserinfo;
import com.king.demo.maven.domain.HdUserinfo;
import com.king.demo.maven.service.IReadJobService;
import com.sun.xml.bind.v2.model.core.ID;

public class ReadJobControllerImpl implements APIIReadJobController {

  @Autowired
  private IReadJobService readJobServiceImpl;

  @Override
  public List<APIHdUserinfo> selectall() throws Exception {
    List<HdUserinfo> result = readJobServiceImpl.selectall();
    List<APIHdUserinfo> newresult = new ArrayList<APIHdUserinfo>();
    for (int i = 0; i < result.size(); i++) {
      APIHdUserinfo aPIHdUserinfo = new APIHdUserinfo();
      aPIHdUserinfo.setId(result.get(i).getId());
      aPIHdUserinfo.setUser(result.get(i).getUser());
      aPIHdUserinfo.setSurplus(result.get(i).getSurplus());
      aPIHdUserinfo.setCreatetime(result.get(i).getCreatetime());
      newresult.add(aPIHdUserinfo);
    }
    System.out.println(newresult);
    return newresult;
  }

  @Override
  public APIHdUserinfo getone(String id) throws Exception {
    HdUserinfo result = readJobServiceImpl.getone(id);
    APIHdUserinfo results = new APIHdUserinfo();
    if (null != result) {
      results.setId(result.getId());
      results.setUser(result.getUser());
      results.setSurplus(result.getSurplus());
      results.setCreatetime(result.getCreatetime());
    }
    return results;
  }

  @Override
  public int delete(String id) throws Exception {
    int result = readJobServiceImpl.delete(id);
    return result;
  }

  @Override
  public int save(APIHdUserinfo user) throws Exception {
    HdUserinfo newuser = new HdUserinfo();
    newuser.setId(user.getId());
    newuser.setUser(user.getUser());
    newuser.setSurplus(user.getSurplus());
    newuser.setCreatetime(user.getCreatetime());
    int result = readJobServiceImpl.save(newuser);
    return result;
  }

  @Override
  public int update(APIHdUserinfo user) throws Exception {
    HdUserinfo newuser = new HdUserinfo();
    newuser.setId(user.getId());
    newuser.setUser(user.getUser());
    newuser.setSurplus(user.getSurplus());
    newuser.setCreatetime(user.getCreatetime());
    int result = readJobServiceImpl.update(newuser);
    return result;
  }

  @Override
  public List<APIHdUserinfo> hbselectall() throws Exception {
    List<HdUserinfo> result = readJobServiceImpl.hbselectall();
    List<APIHdUserinfo> newresult = new ArrayList<APIHdUserinfo>();
    for (int i = 0; i < result.size(); i++) {
      APIHdUserinfo aPIHdUserinfo = new APIHdUserinfo();
      aPIHdUserinfo.setId(result.get(i).getId());
      aPIHdUserinfo.setUser(result.get(i).getUser());
      aPIHdUserinfo.setSurplus(result.get(i).getSurplus());
      aPIHdUserinfo.setCreatetime(result.get(i).getCreatetime());
      newresult.add(aPIHdUserinfo);
    }
    System.out.println(newresult);
    return newresult;
  }

  @Override
  public APIHdUserinfo hbgetone(String id) throws Exception {
    HdUserinfo result = readJobServiceImpl.hbgetone(id);
    APIHdUserinfo results = new APIHdUserinfo();
    if (null != result) {
      results.setId(result.getId());
      results.setUser(result.getUser());
      results.setSurplus(result.getSurplus());
      results.setCreatetime(result.getCreatetime());
    }

    return results;
  }

  @Override
  public int hbdelete(String id) throws Exception {
    int result = readJobServiceImpl.hbdelete(id);
    return result;
  }

  @Override
  public int hbsave(APIHdUserinfo user) throws Exception {
    HdUserinfo newuser = new HdUserinfo();
    newuser.setId(user.getId());
    newuser.setUser(user.getUser());
    newuser.setSurplus(user.getSurplus());
    newuser.setCreatetime(user.getCreatetime());
    int result = readJobServiceImpl.hbsave(newuser);
    return result;
  }

  @Override
  public int hbupdate(APIHdUserinfo user) throws Exception {
    HdUserinfo newuser = new HdUserinfo();
    newuser.setId(user.getId());
    newuser.setUser(user.getUser());
    newuser.setSurplus(user.getSurplus());
    newuser.setCreatetime(user.getCreatetime());
    int result = readJobServiceImpl.hbupdate(newuser);
    return result;
  }

}
