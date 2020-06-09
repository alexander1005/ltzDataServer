package com.ltz;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableRabbit
@ComponentScan("com.ltz")
public class DataServerApp {

  public static void main(String[] args) {
    SpringApplication.run(DataServerApp.class, args);
  }
}
