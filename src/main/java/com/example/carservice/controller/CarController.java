package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CarController {
    @Autowired
    CarRepository carsRepository;
    @GetMapping
    //Primeiro Commit
    public ResponseEntity<List<Car>> getCars(){
        List<Car> all = carsRepository.findAll();
        return ResponseEntity.ok(all);

    }
}