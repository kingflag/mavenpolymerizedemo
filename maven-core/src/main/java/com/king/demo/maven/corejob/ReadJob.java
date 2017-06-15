package com.king.demo.maven.corejob;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.king.demo.maven.controller.IReadJobController;

public class ReadJob implements ApplicationContextAware {

  protected static final Logger logger = LoggerFactory.getLogger(ReadJob.class);

  private ApplicationContext appCtx;

  @Autowired
  private IReadJobController readJobControllerImpl;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    this.appCtx = applicationContext;

  }

  public void run() throws Exception {
    System.out.println("ReadJob");
    logger.info(null, appCtx);
    String beanName = "readJobcontroller";
    logger.info("取testbean:" + appCtx.containsBean("testbaen"));
    if (appCtx.containsBean(beanName)) {
      logger.info("存在ReadJobcontroller");
      // readJobControllerImpl.selectall();
    } else {
      logger.info("不存在此bean");
    }
  }

}
