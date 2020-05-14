package com.cbd.personFront;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan("com.cbd.personFront.dao")
@SpringBootApplication  //(scanBasePackages = "com.cbd.personFront.bean")
public class PersonFrontMain {
    public static void main(String[] args) {
        SpringApplication.run(PersonFrontMain.class,args);
    }
}
