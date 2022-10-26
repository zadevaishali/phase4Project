package com.simplilearn.eFoodCrush.dto;

import java.util.List;

import com.simplilearn.eFoodCrush.entity.Cart;
import com.simplilearn.eFoodCrush.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private int id;
	private String username;
	private String emailId;
	private String mobileNumber;
	private String role;
	private List<Order> userOrders;
	private List<Cart> userCart;
	private boolean isActive;
	private boolean isNotLocked;
}
