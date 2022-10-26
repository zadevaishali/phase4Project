package com.simplilearn.eFoodCrush.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.eFoodCrush.entity.Order;
import com.simplilearn.eFoodCrush.entity.User;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	public List<Order> findByUser(User user);

}
