package com.shanlh.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description:
 * @Author: 单乐鸿
 * @CreateDate: 2018/11/9 21:43
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.shanlh.sleuth.service")
public class Trace1Application {

    public static void main(String[] args) {
        SpringApplication.run(Trace1Application.class, args);

    }
}
