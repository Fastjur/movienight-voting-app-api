package net.liquidpineapple.movienight.server.backend.api;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Jurriaan Den Toonder
 */
@Slf4j
@Path("/version")
public class VersionApi {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getTest() {
    return "Hello world";
  }
}
