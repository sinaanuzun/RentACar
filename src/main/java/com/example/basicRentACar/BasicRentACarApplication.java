package com.example.basicRentACar;

import com.example.basicRentACar.entity.Car;
import com.example.basicRentACar.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BasicRentACarApplication implements CommandLineRunner {

	private final CarRepository carRepository;

	public BasicRentACarApplication(CarRepository carRepository) {
		this.carRepository = carRepository;
	}


	public void run(String... args) throws Exception {
		Car car = Car.builder()
				.id(11)
				.brand("Volvo")
				.model("S90").build();
		Car car2 = Car.builder()
				.id(12)
				.brand("Citroen")
				.model("C-Elysee").build();
		Car car3 = Car.builder()
				.id(13)
				.brand("Kia")
				.model("Cerato").build();
		carRepository.saveAll(Arrays.asList(car, car2, car3));
	}
	public static void main(String[] args) {
		SpringApplication.run(BasicRentACarApplication.class, args);
	}

}
