package com.simplilearn.eFoodCrush.service;

import java.util.List;

import com.simplilearn.eFoodCrush.entity.Order;
import com.simplilearn.eFoodCrush.entity.User;
import com.simplilearn.eFoodCrush.exception.OrderNotFoundException;

public interface OrderService {
	public List<Order> getAllOrders();

	public List<Order> getAllOrdersByUser(User user);

	public Order getOrderById(int orderId) throws OrderNotFoundException;

	public Order addOrder(Order order);

	public void deleteOrder(int orderId);

}
