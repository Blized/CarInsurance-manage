package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wyq3142384480
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.demo.mapper")
public class PolicyApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(PolicyApp8001.class,args);
    }
}
