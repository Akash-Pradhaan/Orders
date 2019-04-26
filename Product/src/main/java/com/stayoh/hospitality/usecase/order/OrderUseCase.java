package com.stayoh.hospitality.usecase.order;

import java.util.List;

import com.stayoh.hospitality.entity.Order;

public interface OrderUseCase {

	Order save(Order order);
	
	Order find(Integer oid);
	
	List<Order> findAll();
	
	Integer delete(Integer oid);
	
	
	
}
