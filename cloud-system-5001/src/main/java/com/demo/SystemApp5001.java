package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.demo.mapper")
public class SystemApp5001 {
    public static void main(String[] args) {
        SpringApplication.run(SystemApp5001.class,args);
    }
}
