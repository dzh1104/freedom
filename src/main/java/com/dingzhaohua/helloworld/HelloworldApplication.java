package com.dingzhaohua.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloworldApplication {

    @RequestMapping("/")
    String index() {
        return "Hello Spring boot2";
    }

    public static void main(String[] args) {

        SpringApplication.run(HelloworldApplication.class, args);
    }

}
