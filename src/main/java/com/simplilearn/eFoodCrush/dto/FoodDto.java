package com.simplilearn.eFoodCrush.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodDto {

	private int id;
	private String name;
	private int price;
	private int quantityAvailable;
	private String imageUrl;

}

