package com.shanlh.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Author: 单乐鸿
 * @CreateDate: 2018/11/9 21:43
 */
@EnableEurekaClient
@SpringBootApplication
public class Trace2Application {

    public static void main(String[] args) {
        SpringApplication.run(Trace2Application.class, args);

    }
}
