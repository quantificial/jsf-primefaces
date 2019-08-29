package com.codenotfound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;

@SpringBootApplication
@EnableHazelcastHttpSession
public class SpringPrimeFacesApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringPrimeFacesApplication.class, args);
  }
}
