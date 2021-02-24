package com.bracso.demo.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class DecoratorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorDemoApplication.class, args);
    }

}
