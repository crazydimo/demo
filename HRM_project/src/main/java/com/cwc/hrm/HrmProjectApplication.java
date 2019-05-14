package com.cwc.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cwc.hrm.dao")
public class HrmProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmProjectApplication.class, args);
    }

}
