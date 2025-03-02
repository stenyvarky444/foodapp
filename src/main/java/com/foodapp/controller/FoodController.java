package com.foodapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("food")
public class FoodController {
	
	@GetMapping("/getdata")
	public String getFoodData(@RequestParam String id) {
		return new String();
	}
	

}
