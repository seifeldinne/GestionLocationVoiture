package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.HorsePower;

@Repository
public class HorsePowerDAOImp  implements IHorsePowerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveHorsePower(HorsePower HorsePower) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(HorsePower);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<HorsePower> getHorsePowers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<HorsePower> query=currentSession.createQuery("from horsePower", HorsePower.class);
		List<HorsePower> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteHorsePower(HorsePower HorsePower) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(HorsePower);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<HorsePower> getHorsePowerByID(HorsePower HorsePower) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<HorsePower> query=currentSession.createQuery("from horsePower where id_horse=:id_HorsePower", HorsePower.class);
		query.setParameter("id_HorsePower", HorsePower.getIdHorse());
		List<HorsePower> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateHorsePower(HorsePower HorsePower) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(HorsePower);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
