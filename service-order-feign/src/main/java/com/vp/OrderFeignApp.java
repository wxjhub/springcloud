package com.vp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * Feign客户端调用，使用Hystrix熔断器，服务降级
 * @author wangxinji
 * @deprecated 如何不开启Hystrix，如果高并发情况下，会产生线程堆积，导致其他服务无法访问，
 * 如果开启，浏览器会瞬间访问，浏览器不会转圈圈
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class OrderFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApp.class, args);
    }
}
