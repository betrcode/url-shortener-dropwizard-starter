package com.klarna.urlshortener.resources;

import com.google.common.base.Optional;
import com.klarna.urlshortener.api.ShortUrl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/api/url")
@Produces(MediaType.APPLICATION_JSON)
public class ShortUrlResource {

  @GET
  public ShortUrl getShortUrl(@QueryParam("id") Optional<String> id) {
    //FIXME: Dummy implementation
    return new ShortUrl("http://www.dropwizard.io/0.9.2/docs/getting-started.html",
        "http://go/dw092");
  }
}
