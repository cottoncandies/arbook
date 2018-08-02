package com.alva.arbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.alva.arbook.dao")
public class ArbookApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(ArbookApplication.class, args);
    }
}
