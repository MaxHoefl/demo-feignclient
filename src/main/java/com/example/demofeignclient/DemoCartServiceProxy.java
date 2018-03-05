package com.example.demofeignclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.resource.Cart;

@FeignClient(name="${feign.name}", configuration=FeignConfig.class)
@RibbonClient(name="${feign.name}")
public interface DemoCartServiceProxy 
{
	@GetMapping("/carts/{cartId}")
	public Cart getCart(@PathVariable("cartId") long id);
}
