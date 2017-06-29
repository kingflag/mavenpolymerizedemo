package com.king.demo.maven.rs.server;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






import com.king.demo.maven.APIdomain.APIHdUserinfo;
import com.king.demo.maven.controller.APIIReadJobController;
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
  public int delete(String id) throws Exception {
    System.out.println(id);
    int result = readJobController.delete(id);
    return result;
  }

}
