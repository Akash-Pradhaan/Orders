package com.stayoh.hospitality.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stayoh.hospitality.entity.Order;
import com.stayoh.hospitality.usecase.order.OrderUseCase;

@RestController
@RequestMapping(value="/api")
public class ProductController {
	
	@Autowired
	private OrderUseCase useCase;
	
	@PostMapping("/order")
	public Order addorder(@RequestBody Order order) {
		return useCase.save(order);		
	}
	
	@GetMapping("/order")
	public List<Order> allOrder(){
		return  useCase.findAll();
		
	}

}
