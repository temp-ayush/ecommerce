package com.wu.ecommerce.service;

import java.util.ArrayList;
import java.util.Optional;

import com.wu.ecommerce.dto.Order;

public interface OrderService {
	public Order addOrder(Order order);
	public Optional<Order> getOrderByOrderId (String id);
	public Optional<ArrayList<Order>> getOrders();
	public Optional<ArrayList<Order>> getAllOrdersByAddress(String address);
	public String removeOrderByOrderId(String id);
	public Order updateOrderByOrderId (String id, Order order);
}
