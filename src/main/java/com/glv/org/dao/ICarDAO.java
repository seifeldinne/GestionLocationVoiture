package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Car;

public interface ICarDAO {

	public boolean saveCar(Car car);
	public List<Car> getCars();
	public boolean deleteCar(Car car);
	public List<Car> getCarByID(Car car);
	public boolean updateCar(Car car);
}
