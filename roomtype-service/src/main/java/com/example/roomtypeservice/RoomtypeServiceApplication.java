package com.example.roomtypeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RoomtypeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomtypeServiceApplication.class, args);
    }

}
