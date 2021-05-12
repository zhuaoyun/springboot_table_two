package com.zay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zay.mapper")
public class SpringbootTableTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTableTwoApplication.class, args);
    }

}
