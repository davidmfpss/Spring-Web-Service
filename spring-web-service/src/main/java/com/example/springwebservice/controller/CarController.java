package com.example.springwebservice.controller;

import com.example.springwebservice.model.CarOwner;
import com.example.springwebservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Car")

public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping()
    public List<CarOwner> getAllUsers() {
        List<CarOwner> CarList = this.carService.getAllCar();
        return CarList;
    }

    @GetMapping("/{id}")
    public CarOwner getCar(@PathVariable int id) {
        CarOwner Car = this.carService.getCar(id);
        return Car;
    }

    @PostMapping()
    public CarOwner creatCar(@RequestBody CarOwner Car) {
        CarOwner createdCar = this.carService.creatCar(Car);
        return createdCar;
    }

    @PutMapping("/{id}")
    public CarOwner updateCar(@PathVariable int id, @RequestBody CarOwner Car) {
        CarOwner updateCar = this.carService.updateCar(id, Car);
        return updateCar;
    }

    @DeleteMapping("/{id}")
    public CarOwner deleteCar(@PathVariable int id) {
        CarOwner deleteCar = this.carService.deleteCar(id);
        return deleteCar;
    }

}
