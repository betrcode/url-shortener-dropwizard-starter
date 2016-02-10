package com.klarna.urlshortener;

import com.klarna.urlshortener.resources.HomeResource;
import com.klarna.urlshortener.resources.ShortUrlResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class UrlShortenerApplication extends Application<UrlShortenerConfiguration> {

  public final static String APP_NAME = "urlshortener";

  @Override
  public String getName() {
    return APP_NAME;
  }

  @Override
  public void initialize(Bootstrap<UrlShortenerConfiguration> bootstrap) {
    enableViews(bootstrap);
  }

  @Override
  public void run(UrlShortenerConfiguration configuration,
                  Environment environment) throws Exception {
    registerResources(environment);
  }

  /**
   * Registers endpoints to make them available to callers
   */
  private void registerResources(Environment environment) {
    environment.jersey().register(new HomeResource());
    environment.jersey().register(new ShortUrlResource());
  }


  /**
   * Enables web pages
   */
  private void enableViews(Bootstrap bootstrap) {
    bootstrap.addBundle(new ViewBundle<UrlShortenerConfiguration>());
  }

  /**
   * Needed to be able to use 'application' plugin
   * so we can run application using: ./gradlew run
   */
  public static void main(String[] args) throws Exception {
    new UrlShortenerApplication().run(args);
  }
}
