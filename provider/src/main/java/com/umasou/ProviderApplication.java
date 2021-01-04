package com.umasou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.umasou.dao")
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        System.setProperty("dubbo.application.logger", "slf4j");
        SpringApplication.run(ProviderApplication.class, args);
    }


}
