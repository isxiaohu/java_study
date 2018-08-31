package com.tiger.study.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by renchunbao
 */
@SpringBootApplication(scanBasePackages = "com.tiger")
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class,args);
    }
}
