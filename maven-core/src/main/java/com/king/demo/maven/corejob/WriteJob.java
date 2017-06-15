package com.king.demo.maven.corejob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.king.demo.maven.controller.IWriteJobController;

public class WriteJob implements ApplicationContextAware {

  protected static final Logger logger = LoggerFactory.getLogger(WriteJob.class);
  private ApplicationContext appCtx;

  @Autowired
  private IWriteJobController writeJobControllerImpl;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.appCtx = applicationContext;
  }

  public void run() throws Exception {
    System.out.println("WriteJob");
    String beanName = "writeJobcontroller";
    System.out.println("取testbean:"+appCtx.containsBean("testbaen"));
    if (appCtx.containsBean(beanName)) {
      System.out.println("存在WriteJobcontroller");
      writeJobControllerImpl.insert();
      
    } else {
      System.out.println("不存在此bean");
    }
  }

}
