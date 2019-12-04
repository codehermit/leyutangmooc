package com.leyutang.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.leyutang.edu","com.leyutang.common"})
public class EduApplication {

    public static void main(String[] args){
        SpringApplication.run(EduApplication.class, args);
    }
}
