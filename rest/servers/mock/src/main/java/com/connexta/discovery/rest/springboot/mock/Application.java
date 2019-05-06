package com.connexta.discovery.rest.springboot.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
    excludeFilters = {
      @ComponentScan.Filter(
          type = FilterType.REGEX,
          pattern = "com.connexta.discovery.rest.springboot.mock.*")
    })
@SuppressWarnings("unused")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  /** @return main application bean */
  @Bean
  public Application app() {
    return new Application();
  }

  @Bean
  public DiscoveryController discoveryController() {
    return new DiscoveryController();
  }
}
