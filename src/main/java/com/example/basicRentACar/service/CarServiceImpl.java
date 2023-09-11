package com.example.basicRentACar.service;

import com.example.basicRentACar.entity.Car;
import com.example.basicRentACar.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(int theId) {
        Optional<Car> result = carRepository.findById(theId);

        Car car = null;

        if(result.isPresent()){
            car=result.get();
        }
        else {
            throw new RuntimeException("Bu idye ait araç bulunamadı - " + theId);
        }
        return car;
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteById(int theId) {
        carRepository.deleteById(theId);
    }
}
