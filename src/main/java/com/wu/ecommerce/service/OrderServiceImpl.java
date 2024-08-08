package com.wu.ecommerce.service;

import java.util.ArrayList;
import java.util.Optional;

import com.wu.ecommerce.dto.Order;
import com.wu.ecommerce.repo.OrderRepository;
import com.wu.ecommerce.repo.OrderRepositoryImpl;

public class OrderServiceImpl implements OrderService {
	
private OrderRepository orderRepository = OrderRepositoryImpl.getInstance();
	
	private OrderServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static OrderService orderService;
	
	public static OrderService getInstance() {
		if(orderService == null) {
			orderService = new OrderServiceImpl();
		}
		
		return orderService;
	}
	
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.addOrder(order);
	}

	@Override
	public Optional<Order> getOrderByOrderId(String id) {
		// TODO Auto-generated method stub
		return orderRepository.getOrderByOrderId(id);
	}

	@Override
	public Optional<ArrayList<Order>> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ArrayList<Order>> getAllOrdersByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeOrderByOrderId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrderByOrderId(String id, Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
