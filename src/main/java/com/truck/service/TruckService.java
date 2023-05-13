package com.truck.service;

import com.truck.dao.TruckRepository;
import com.truck.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckService {
    @Autowired
    private TruckRepository truckRepository;
    public List<FoodTruck> findTruck(String zip, String keywords){

        return truckRepository.findTrucks(zip,keywords);
    }
}
