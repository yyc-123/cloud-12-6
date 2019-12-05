package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Config2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Config2ServerApplication.class,args);
    }
}