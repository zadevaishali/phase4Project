package com.simplilearn.eFoodCrush.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="foods")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String price;
	private int quantityAvailable;
	private String imageUrl;
	public Food() {
		
	}
	public Food(String name, String price, int quantityAvailable, String imageUrl) {
		super();
		this.name = name;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
		this.imageUrl = imageUrl;
	}
	
	
	

}
