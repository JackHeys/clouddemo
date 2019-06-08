package com.springcloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineApplication.class).properties("server.port=" + 8021).run(args);
    }

}
