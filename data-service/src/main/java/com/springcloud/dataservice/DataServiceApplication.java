package com.springcloud.dataservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class DataServiceApplication  {

    public static void main(String[] args) {
        int port=8001;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("请输入端口：8001,8002,8003------");
        //port = scanner.nextInt();
        //SpringApplication.run(DataServiceApplication.class, args);

        new SpringApplicationBuilder(DataServiceApplication.class).properties("server.port=" + port).run(args);
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
