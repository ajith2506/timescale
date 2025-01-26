package com.yaantrac.timescaledb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class TimescaledbApplication {

    public static void main(String[] args) {
        Thread.currentThread().setName("MAIN");
        SpringApplication.run(TimescaledbApplication.class, args);
    }




}
