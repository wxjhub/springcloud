package com.vp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * wangxinji
 */
@SpringBootApplication
@EnableEurekaClient
public class NumeberApp {
    public static void main(String[] args) {
        SpringApplication.run(NumeberApp.class,args);
    }
}
