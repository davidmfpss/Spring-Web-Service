package com.example.springwebservice.service;

import com.example.springwebservice.model.CarOwner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<CarOwner> carOwnerList;

    public CarService() {
        this.carOwnerList = new ArrayList();
        this.carOwnerList.add(new CarOwner(1, "david", 2, "Seveln"));
        this.carOwnerList.add(new CarOwner(2, "mimi", 3, "Rava4"));
        this.carOwnerList.add(new CarOwner(3, "gigi", 5, "Honda"));
        this.carOwnerList.add(new CarOwner(4, "betty", 4, "Vios"));
    }

    public List<CarOwner> getAllCar() {
        return this.carOwnerList;
    }

    public CarOwner getCar(int id) {
        for (CarOwner Car : this.carOwnerList) {
            if (id == Car.getId()) {
                return Car;
            }
        }
        return null;
    }

    public CarOwner creatCar(CarOwner Car) {
        this.carOwnerList.add(Car);
        return Car;
    }

    public CarOwner updateCar(int id, CarOwner Car) {
        for (CarOwner updateCar : this.carOwnerList) {
            if (id == updateCar.getId()) {
                updateCar.setCount(Car.getCount());
                updateCar.setCarname(Car.getCarname());
                return updateCar;
            }
        }
        return null;
    }

    public CarOwner deleteCar(int id) {
        for (CarOwner Car : this.carOwnerList) {
            if (id == Car.getId()) {
                this.carOwnerList.remove(Car);
                return Car;
            }
        }
        return null;
    }
}