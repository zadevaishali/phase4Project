package com.simplilearn.eFoodCrush.dto;

import com.simplilearn.eFoodCrush.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
	private int id;
	private String foodName;
	private int quantity;
	private int price;
	private int totalPrice;
	private String imageUrl;
	private User user;

}