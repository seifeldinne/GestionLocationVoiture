package com.glv.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glv.org.dao.ICarDAO;
import com.glv.org.entite.Car;

@Service
@Transactional
public class CarServiceImp implements ICarService {
 
	@Autowired
	private ICarDAO carDao;
	
	@Override
	public boolean saveCar(Car Car) {
		return carDao.saveCar(Car);
	}

	@Override
	public List<Car> getCars() {
		return carDao.getCars();
	}

	@Override
	public boolean deleteCar(Car Car) {
		return carDao.deleteCar(Car);
	}

	@Override
	public List<Car> getCarByID(Car Car) {
		return carDao.getCarByID(Car);
	}

	@Override
	public boolean updateCar(Car Car) {
		return carDao.updateCar(Car);
	}

}
