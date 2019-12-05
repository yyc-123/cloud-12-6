package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class);
    }
}
