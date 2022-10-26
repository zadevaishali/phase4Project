package com.simplilearn.eFoodCrush.service;

import java.util.List;

import com.simplilearn.eFoodCrush.entity.Food;
import com.simplilearn.eFoodCrush.exception.FoodNotFoundException;

public interface FoodService {
  public List<Food> getAllFoods();
  public Food getFoodById(int foodId) throws FoodNotFoundException;

	public Food addFood(Food food);

	public Food updateFood(int foodId, Food food) throws FoodNotFoundException;

	public void deleteFood(int foodId);

}
