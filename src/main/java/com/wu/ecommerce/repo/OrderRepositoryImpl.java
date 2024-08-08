package com.wu.ecommerce.repo;

import java.util.ArrayList;
import java.util.Optional;

import com.wu.ecommerce.dto.Order;

public class OrderRepositoryImpl implements OrderRepository {
	
	
	private OrderRepositoryImpl() {
//		pvt constructor
	}
	
	private static OrderRepository orderRepository;
	
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public static OrderRepository getInstance() {
		if(orderRepository == null) {
//			create the object;
			orderRepository = new OrderRepositoryImpl();
		}
		return orderRepository;
	}
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		if(orders.add(order)) {
			return order;
		}
		
		return null;
	}

	@Override
	public Optional<Order> getOrderByOrderId(String id) {
		// TODO Auto-generated method stub
		return orders.stream().filter(e-> e.getOrderId().equals(id)).findFirst();
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
