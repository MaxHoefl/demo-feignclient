package com.example.demofeignclient;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.resource.Cart;

@RestController
public class CheckoutController 
{
	private static final Logger LOG = LoggerFactory.getLogger(CheckoutController.class);
	
	@Autowired private DemoCartServiceProxy proxy;
	
	@GetMapping("checkout/{cartId}")
	public String checkout(@PathVariable("cartId") long cartId)
	{
		Cart cart = proxy.getCart(cartId);
		
		LOG.info("Retrieved cart {}, {}", cart.getId(), cart.getItems().stream().map(i -> i.getItemName()).collect(Collectors.toList()));
		
		return "checking out cart " + cart.getId();
	}
	
}
