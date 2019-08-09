package com.glv.org.service;

import java.util.List;

import com.glv.org.entite.Car;

public interface ICarService {

	
	public boolean saveCar(Car car);
	public List<Car> getCars();
	public boolean deleteCar(Car car);
	public List<Car> getCarByID(Car car);
	public boolean updateCar(Car car);
}
