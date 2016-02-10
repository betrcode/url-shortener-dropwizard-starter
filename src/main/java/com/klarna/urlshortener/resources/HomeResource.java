package com.klarna.urlshortener.resources;

import com.klarna.urlshortener.views.HomeView;
import lombok.NoArgsConstructor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
@NoArgsConstructor
public class HomeResource {

  @GET
  public HomeView getHomeView() {
    return new HomeView();
  }
}
