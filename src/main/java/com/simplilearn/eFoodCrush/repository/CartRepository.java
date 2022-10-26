package com.simplilearn.eFoodCrush.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.eFoodCrush.entity.Cart;
import com.simplilearn.eFoodCrush.entity.User;

public interface CartRepository extends JpaRepository<Cart, Integer> {
public Cart findByUser(User user);
}
