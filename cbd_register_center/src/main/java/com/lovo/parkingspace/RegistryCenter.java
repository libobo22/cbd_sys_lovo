package com.lovo.parkingspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka 服务注册中心
 *
 * @author liren
 * @date 2020-04-30
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryCenter {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenter.class, args);
    }
}
