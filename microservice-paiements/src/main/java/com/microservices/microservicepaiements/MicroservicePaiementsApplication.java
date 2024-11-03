package com.microservices.microservicepaiements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients(basePackages = "com.microservices.microservicepaiements.proxies")
@EnableDiscoveryClient
public class MicroservicePaiementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicePaiementsApplication.class, args);
    }
}
