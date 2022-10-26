package com.simplilearn.eFoodCrush.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.eFoodCrush.dto.FoodDto;
import com.simplilearn.eFoodCrush.exception.FoodNotFoundException;
import com.simplilearn.eFoodCrush.entity.Food;
import com.simplilearn.eFoodCrush.response.ApiResponse;
import com.simplilearn.eFoodCrush.service.FoodService;
@RestController
@RequestMapping(path = { "/foods", "/admin/foods" })
public class FoodController {

	@Autowired
	public ModelMapper modelMapper;

	@Autowired
	public FoodService foodService;

	@GetMapping
	public List<FoodDto> getAllFoods() {
		return foodService.getAllFoods().stream().map(food -> modelMapper.map(food, FoodDto.class))
				.collect(Collectors.toList());
	}

	@PostMapping("/addFood")
	public ResponseEntity<FoodDto> addFood(@RequestBody FoodDto foodDto) {
		Food foodRequest = modelMapper.map(foodDto, Food.class);
		Food food = foodService.addFood(foodRequest);
		FoodDto foodResponse = modelMapper.map(food, FoodDto.class);
		return new ResponseEntity<>(foodResponse, CREATED);

	}

	@PutMapping("/editFood/{id}")
	public ResponseEntity<FoodDto> updateFood(@PathVariable(name = "id") String id, @RequestBody FoodDto foodDto)
			throws FoodNotFoundException {
		Food foodRequest = modelMapper.map(foodDto, Food.class);
		Food food = foodService.updateFood(Integer.parseInt(id), foodRequest);
		FoodDto foodResponse = modelMapper.map(food, FoodDto.class);
		return ResponseEntity.ok().body(foodResponse);
	}

	@DeleteMapping("/deleteFood/{id}")
	public ResponseEntity<ApiResponse> deleteFood(@PathVariable int id) {
		foodService.deleteFood(id);
		ApiResponse apiResponse = new ApiResponse(OK, "Food deleted successfully");
		return new ResponseEntity<>(apiResponse, OK);
	}

}

