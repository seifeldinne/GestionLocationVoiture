package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Fule;

@Repository
public class FuleDAOImp  implements IFuleDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveFule(Fule Fule) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(Fule);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Fule> getFules() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Fule> query=currentSession.createQuery("from fule", Fule.class);
		List<Fule> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteFule(Fule fule) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(fule);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Fule> getFuleByID(Fule fule) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Fule> query=currentSession.createQuery("from fule where id_Fule=:id_Fule", Fule.class);
		query.setParameter("id_fule", fule.getIdFule());
		List<Fule> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateFule(Fule fule) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(fule);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
