package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/car")

public class CarController {

    private final CarService carService;


    @Autowired //dependency injection
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping
        public List<Car> getCars () {

            return carService.getCars();
        }
    }

