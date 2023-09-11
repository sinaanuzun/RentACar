package com.example.basicRentACar.service;

import com.example.basicRentACar.entity.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    Car findById(int theId);

    Car save(Car car);

    void deleteById(int theId);
}
