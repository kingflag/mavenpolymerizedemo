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
  public int delete(String id) throws Exception {
    int result = readJobServiceImpl.delete(id);
    return result;
  }

}
