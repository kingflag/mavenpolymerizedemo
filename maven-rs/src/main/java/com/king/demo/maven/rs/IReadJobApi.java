package com.king.demo.maven.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.king.demo.maven.domain.HdUserinfo;

@Path("/apicla")
@Produces(value = {
    MediaType.APPLICATION_JSON })
  @Consumes(value = {
    MediaType.APPLICATION_JSON })
public interface IReadJobApi {

  @GET
  @Path("/apifunc")
  public List<HdUserinfo> test() throws Exception;

}
