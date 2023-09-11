package com.example.basicRentACar.controller;

import com.example.basicRentACar.entity.Car;
import com.example.basicRentACar.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

   CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public List<Car> findAll(){
        return carService.findAll();
    }


    @GetMapping("/car/{carId}")
    public Car car(@PathVariable int carId){
        Car car = carService.findById(carId);
        if(car==null){
            throw new RuntimeException("Bu idye ait araç bulunamadı - " + carId);
        }

        return car;
    }

    @PostMapping("/car")
    public Car addCar(@RequestBody Car car){
        car.setId(0);

        Car theCar = carService.save(car);

        return theCar;
    }


    @PutMapping("/car")
    public Car updateCar(@RequestBody Car car){
        Car upCar = carService.save(car);

        return upCar;
    }


    @DeleteMapping("/car/{carId}")
    public String deleteCar(@PathVariable int carId){

        Car deleteCar = carService.findById(carId);

        if(deleteCar==null){
            throw new RuntimeException("Bu idye ait araç bulunamadı - " + carId);
        }
        carService.deleteById(carId);

        return "Araç silindi. ID : " + carId;
    }

}
