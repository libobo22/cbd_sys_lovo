package com.cbd.companyFront;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//自定义dao交给mybatis
@MapperScan("com.cbd.companyFront.dao")
@SpringBootApplication
public class CompanyMain {

    public static void main(String[] args) {

        //启动
        SpringApplication.run(CompanyMain.class);
    }
}
