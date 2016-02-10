package com.klarna.urlshortener;

import com.klarna.urlshortener.resources.ShortUrlResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class UrlShortenerApplication extends Application<UrlShortenerConfiguration> {

  @Override
  public String getName() {
    return "urlshortener";
  }

  @Override
  public void initialize(Bootstrap<UrlShortenerConfiguration> bootstrap) {
    //Nothing to do yet
  }

  @Override
  public void run(UrlShortenerConfiguration configuration,
                  Environment environment) throws Exception {
    registerResources(environment);
  }

  private void registerResources(Environment environment) {
    environment.jersey().register(new ShortUrlResource());
  }

  /**
   * Needed to be able to use 'application' plugin
   * so we can run application using: ./gradlew run
   */
  public static void main(String[] args) throws Exception {
    new UrlShortenerApplication().run(args);
  }
}
