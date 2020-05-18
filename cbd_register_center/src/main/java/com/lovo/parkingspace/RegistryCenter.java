package com.lovo.parkingspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryCenter {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenter.class, args);
    }
}
