package com.simplilearn.eFoodCrush.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	private String foodName;
	private int quantity;
	private int price;
	private int totalPrice;
	private String imageUrl;
	
	public Cart() {
		
	}
	public Cart(String foodName, int quantity, int price, int totalPrice, String imageUrl) {
		super();
		this.foodName = foodName;
		this.quantity = quantity;
		this.price = price;
		this.totalPrice = totalPrice;
		this.imageUrl = imageUrl;
	}
	
	
	

}
