package com.king.demo.maven.rs.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hd123.rumba.commons.biz.entity.OperateContext;
import com.hd123.rumba.commons.codec.CodecUtilsBean;
import com.hd123.rumba.commons.lang.Assert;
import com.hd123.rumba.commons.rs.entity.OperateContextConverter;
import com.king.demo.maven.APIdomain.APIHdUserinfo;
import com.king.demo.maven.controller.APIIReadJobController;
import com.king.demo.maven.rs.server.converter.HdUserinfoConverter;
import com.king.demo.maven.rs.server.converter.RSHdUserinfo;
import com.king.demo.maven.rs.service.IReadJobApi;

public class ReadJobApiImpl implements IReadJobApi {

  protected static final Logger logger = LoggerFactory.getLogger(ReadJobApiImpl.class);

  private APIIReadJobController readJobController;

  public ReadJobApiImpl() {
    System.out.println("ReadJobApi构造方法+++++++++++");
  }

  public APIIReadJobController getreadJobController() {
    return readJobController;
  }

  public void setreadJobController(APIIReadJobController readJobController) {
    this.readJobController = readJobController;
  }

  @SuppressWarnings("finally")
  public List<APIHdUserinfo> test() throws Exception {
    String resultString = "我要输出的数据";

    try {

      logger.info(resultString);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      return readJobController.selectall();
    }
  }

  @Override
  public Map<String, Object> findall() throws Exception {
    Map<String, Object> resultMap = new HashMap<String, Object>();
    try {
      resultMap.put("restlt", readJobController.selectall());
      return resultMap;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Map<String, Object> getone(String id) throws Exception {
    Map<String, Object> resultMap = new HashMap<String, Object>();
    try {
      resultMap.put("restlt", readJobController.getone(id));
      return resultMap;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public int delete(String id) throws Exception {
    System.out.println(id);
    Assert.assertArgumentNotNull(id, "id");
    int result = readJobController.delete(id);
    System.out.println(result);
    return result;
  }

  @Override
  public int save(RSHdUserinfo user) throws Exception {

    Assert.assertAttributeNotNull(user, "user");
    System.out.println(user.toString());
    int result = readJobController.save(HdUserinfoConverter.getInstance().convert(user));
    return result;
  }

  @Override
  public int update(RSHdUserinfo user) throws Exception {
    Assert.assertAttributeNotNull(user, "user");
    System.out.println(user.toString());
    int result = readJobController.update(HdUserinfoConverter.getInstance().convert(user));
    return result;
  }

  @Override
  public Map<String, Object> hbfindall() throws Exception {
    Map<String, Object> resultMap = new HashMap<String, Object>();
    try {
      resultMap.put("restlt", readJobController.hbselectall());
      return resultMap;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Map<String, Object> hbgetone(String id) throws Exception {
    Map<String, Object> resultMap = new HashMap<String, Object>();
    try {
      resultMap.put("restlt", readJobController.hbgetone(id));
      return resultMap;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public int hbdelete(String id) throws Exception {
    System.out.println("hibernate接收的id:" + id);
    Assert.assertArgumentNotNull(id, "id");
    int result = readJobController.hbdelete(id);
    System.out.println(result);
    return result;
  }

  @Override
  public int hbsave(RSHdUserinfo user) throws Exception {

    Assert.assertAttributeNotNull(user, "user");
    System.out.println("hibernate接收到的user:" + user.toString());
    int result = readJobController.hbsave(HdUserinfoConverter.getInstance().convert(user));
    return result;
  }

  @Override
  public int hbupdate(RSHdUserinfo user) throws Exception {
    Assert.assertAttributeNotNull(user, "user");
    System.out.println("hibernate接收到的user:" + user.toString());
    int result = readJobController.hbupdate(HdUserinfoConverter.getInstance().convert(user));
    return result;
  }

}
