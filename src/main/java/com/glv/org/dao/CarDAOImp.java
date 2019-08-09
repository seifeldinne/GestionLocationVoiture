package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Car;

@Repository
public class CarDAOImp  implements ICarDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveCar(Car car) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(car);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Car> getCars() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query=currentSession.createQuery("from car", Car.class);
		List<Car> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteCar(Car Car) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(Car);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Car> getCarByID(Car Car) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query=currentSession.createQuery("from car where id_car=:id_car", Car.class);
		query.setParameter("id_car", Car.getIdCar());
		List<Car> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateCar(Car car) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(car);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
