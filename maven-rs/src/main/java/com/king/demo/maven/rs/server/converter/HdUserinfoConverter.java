package com.king.demo.maven.rs.server.converter;

import com.hd123.rumba.commons.util.converter.ConversionException;
import com.hd123.rumba.commons.util.converter.Converter;
import com.king.demo.maven.APIdomain.APIHdUserinfo;

public class HdUserinfoConverter implements Converter<RSHdUserinfo, APIHdUserinfo> {

  private static HdUserinfoConverter instance;

  public static HdUserinfoConverter getInstance() {
    if (instance == null)
      instance = new HdUserinfoConverter();
    return instance;
  }

  private HdUserinfoConverter() {
    super();
  }

  @Override
  public APIHdUserinfo convert(RSHdUserinfo source) throws ConversionException {

    if (source == null) {
      return null;
    }

    APIHdUserinfo target = new APIHdUserinfo();
    target.setId(source.getId());
    target.setUser(source.getUser());
    target.setSurplus(source.getSurplus());
    target.setCreatetime(source.getCreatetime());
    return target;
  }

}
