package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PolicyApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(PolicyApp8001.class,args);
    }
}
