package com.spring_cloud.ribbon_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ping-a-server", configuration = RibbonConfiguration.class)
public class RibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonClientApplication.class, args);
    }

}
