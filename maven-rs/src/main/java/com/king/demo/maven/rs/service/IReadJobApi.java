package com.king.demo.maven.rs.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.king.demo.maven.APIdomain.APIHdUserinfo;

@Path("/apicla")
@Produces(value = {
    MediaType.APPLICATION_JSON })
  @Consumes(value = {
    MediaType.APPLICATION_JSON })
public interface IReadJobApi {

  @GET
  @Path("/apifunc")
  public List<APIHdUserinfo> test() throws Exception;
  
  @GET
  @Path("/findall")
  public Map<String, Object> findall() throws Exception;
  
  @DELETE
  @Path("/delete/{id}")
  public int delete(@PathParam("id")String id) throws Exception;
  
  @POST
  @Path("/save/")
  public int save(APIHdUserinfo user) throws Exception;

}
