package com.cwc.hrm_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.cwc.hrm_project.dao")
public class HrmProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmProjectApplication.class, args);
    }
}
