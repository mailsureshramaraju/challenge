package com.truck.controller;

import com.truck.model.FoodTruck;
import com.truck.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TruckController {

	@Autowired
	private TruckService truckService;

	@GetMapping("/trucks")
	public List<FoodTruck> findTrucks(@RequestParam("zip") String zip,
									  @RequestParam("keyword") String keyword) {

		System.out.println(zip+keyword);
		return truckService.findTruck(zip,keyword);
	}
}

