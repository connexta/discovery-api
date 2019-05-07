/**
 * Copyright (c) Connexta
 *
 * <p>This is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details. A copy of the GNU Lesser General Public
 * License is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 */
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
