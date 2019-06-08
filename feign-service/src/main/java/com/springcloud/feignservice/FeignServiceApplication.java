package com.springcloud.feignservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class FeignServiceApplication {

    public static void main(String[] args) {
        int port =8012;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入端口：8011,8012,8013------");
        port = scanner.nextInt();
        new SpringApplicationBuilder(FeignServiceApplication.class).properties("server.port=" + port).run(args);
    }

    /**
     * 在启动类里配置 Sampler 抽样策略： ALWAYS_SAMPLE 表示持续抽样
     * @return
     */
    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
