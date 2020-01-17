package com.watchball.dataserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataserverApplication.class, args);
    }

}
