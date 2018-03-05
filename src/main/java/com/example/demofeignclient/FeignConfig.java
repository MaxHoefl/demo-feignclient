package com.example.demofeignclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Request;

@Configuration
public class FeignConfig 
{
	  @Bean
	  public Request.Options requestOptions() {
	    return new Request.Options(10000, 10000);
	  }
}
