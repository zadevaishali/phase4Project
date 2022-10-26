package com.simplilearn.eFoodCrush.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.eFoodCrush.exception.FoodNotFoundException;
import com.simplilearn.eFoodCrush.entity.Food;
import com.simplilearn.eFoodCrush.repository.FoodRepository;
import com.simplilearn.eFoodCrush.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{
	@Autowired
	public FoodRepository foodRepository;

	@Override
	public List<Food> getAllFoods() {
		return foodRepository.findAll();
	}

	@Override
	public Food getFoodById(int foodId) throws FoodNotFoundException {
		return foodRepository.findById(foodId).orElseThrow(() -> new FoodNotFoundException("Food not found"));
	}

	@Override
	public Food addFood(Food food) {
		return foodRepository.save(food);
	}

	@Override
	public Food updateFood(int foodId, Food food) throws FoodNotFoundException {
		Food existingFood = foodRepository.findById(foodId)
				.orElseThrow(() -> new FoodNotFoundException("Food not found"));
		existingFood.setName(food.getName());
		existingFood.setPrice(food.getPrice());
		existingFood.setQuantityAvailable(food.getQuantityAvailable());
		existingFood.setImageUrl(food.getImageUrl());
		return foodRepository.save(existingFood);
	}

	@Override
	public void deleteFood(int foodId) {
		foodRepository.deleteById(foodId);
	}

}


