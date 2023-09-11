package com.example.basicRentACar.repository;

import com.example.basicRentACar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
