package com.jzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@EntityScan("com.jzy.entity")
@ComponentScan(basePackages = "com.jzy.dao")*/
public class JPAdemoApplication {


    public static void main(String[] args) {

        SpringApplication.run(JPAdemoApplication.class, args);

    }

}
