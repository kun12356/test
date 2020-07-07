package com.rrg.myshop;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.rrg.myshop.dao")
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);
    }
}
