package com.glv.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.glv.org.entite.Car;
import com.glv.org.service.ICarService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/car")
public class CarController {

	@Autowired
	private ICarService Carservice;

	@PostMapping("save-Car")
	public boolean saveCar(@RequestBody Car Car) {
		return Carservice.saveCar(Car);

	}

	@GetMapping("Cars-list")
	public List<Car> allCars() {
		return Carservice.getCars();
	}

	@DeleteMapping("delete-Car/{Car_id}")
	public boolean deleteCar(@PathVariable("Car_id") Long Car_id, Car Car) {
		Car.setIdCar(Car_id);
		return Carservice.deleteCar(Car);
	}

	@GetMapping("Car/{Car_id}")
	public List<Car> allCarByID(@PathVariable("Car_id") Long Car_id, Car Car) {
		Car.setIdCar(Car_id);
		return Carservice.getCarByID(Car);

	}

	@PostMapping("update-Car/{Car_id}")
	public boolean updateCar(@RequestBody Car Car, @PathVariable("Car_id") Long Car_id) {
		Car.setIdCar(Car_id);
		return Carservice.updateCar(Car);
	}
}
