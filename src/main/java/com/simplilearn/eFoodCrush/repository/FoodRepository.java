package com.simplilearn.eFoodCrush.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.eFoodCrush.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
