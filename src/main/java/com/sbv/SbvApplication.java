package com.sbv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@MapperScan("com.sbv.mapper")
@SpringBootApplication
public class SbvApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbvApplication.class, args);
    }

}
