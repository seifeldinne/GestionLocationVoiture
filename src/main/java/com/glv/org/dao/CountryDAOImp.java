package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Country;

@Repository
public class CountryDAOImp  implements ICountryDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveCountry(Country country) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(country);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Country> getCountrys() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Country> query=currentSession.createQuery("from country", Country.class);
		List<Country> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteCountry(Country country) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(country);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Country> getCountryByID(Country country) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Country> query=currentSession.createQuery("from country where id_country=:id_country", Country.class);
		query.setParameter("id_country", country.getIdContry());
		List<Country> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateCountry(Country country) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(country);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
