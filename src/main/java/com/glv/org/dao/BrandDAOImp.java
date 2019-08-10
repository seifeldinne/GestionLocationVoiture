package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Brand;

@Repository
public class BrandDAOImp  implements IBrandDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveBrand(Brand brand) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(brand);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Brand> getBrands() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Brand> query=currentSession.createQuery("from brand", Brand.class);
		List<Brand> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteBrand(Brand brand) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(brand);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Brand> getBrandByID(Brand Brand) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Brand> query=currentSession.createQuery("from brand where id_brand=:id_brand", Brand.class);
		query.setParameter("id_brand", Brand.getIdBrand());
		List<Brand> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateBrand(Brand brand) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(brand);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
