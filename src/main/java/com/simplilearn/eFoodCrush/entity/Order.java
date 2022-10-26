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
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	private int totalPrice;
	private String status;
	private String foods;
	
	public Order() {
	}
	
	public Order(int totalPrice, String status, String foods) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
		this.foods = foods;
	}
	
	
	

}
