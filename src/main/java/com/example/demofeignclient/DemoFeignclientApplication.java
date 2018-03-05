package com.example.demofeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example")
public class DemoFeignclientApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(DemoFeignclientApplication.class, args);
	}
}
