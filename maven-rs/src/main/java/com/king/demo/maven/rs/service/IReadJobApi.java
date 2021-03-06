package com.king.demo.maven.rs.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.king.demo.maven.APIdomain.APIHdUserinfo;
import com.king.demo.maven.rs.server.converter.RSHdUserinfo;

@Path(value = "/apicla")
@Produces(value = {
  MediaType.APPLICATION_JSON })
@Consumes(value = {
  MediaType.APPLICATION_JSON })
public interface IReadJobApi {

  @GET
  @Path(value = "/apifunc")
  public List<APIHdUserinfo> test() throws Exception;

  @GET
  @Path(value = "/findall")
  public Map<String, Object> findall() throws Exception;

  @GET
  @Path(value = "/getone/{id}")
  public Map<String, Object> getone(@PathParam("id") String id) throws Exception;

  //@DELETE
  @POST
  @Path(value = "/delete/{id}")
  public int delete(@PathParam("id") String id)
      throws Exception;

  @POST
  @Path(value = "/save")
  public int save(RSHdUserinfo user) throws Exception;

  @POST
  @Path(value = "/update")
  public int update(RSHdUserinfo user) throws Exception;
  
  /**
   * 以下是hibernate操作数据库
   * @return
   * @throws Exception
   */
  @GET
  @Path(value = "/hbfindall")
  public Map<String, Object> hbfindall() throws Exception;

  @GET
  @Path(value = "/hbgetone/{id}")
  public Map<String, Object> hbgetone(@PathParam("id") String id) throws Exception;

  //@DELETE//extjs不支持DELETE
  @POST
  @Path(value = "/hbdelete/{id}")
  public int hbdelete(@PathParam("id") String id)
      throws Exception;

  @POST
  @Path(value = "/hbsave")
  public int hbsave(RSHdUserinfo user) throws Exception;

  @POST
  @Path(value = "/hbupdate")
  public int hbupdate(RSHdUserinfo user) throws Exception;

}
