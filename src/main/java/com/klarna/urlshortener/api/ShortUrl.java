package com.klarna.urlshortener.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShortUrl {

  @JsonProperty
  private String fullUrl;

  @JsonProperty
  private String shortUrl;

  public ShortUrl() {
    // Jackson deserialization
  }


}
