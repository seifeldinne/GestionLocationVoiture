package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Accessoire;

@Repository
public class AccessoireDAOImp  implements IAccessoireDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveAccessoire(Accessoire accessoire) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(accessoire);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Accessoire> getAccessoires() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Accessoire> query=currentSession.createQuery("from accessoire", Accessoire.class);
		List<Accessoire> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteAccessoire(Accessoire accessoire) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(accessoire);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Accessoire> getAccessoireByID(Accessoire accessoire) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Accessoire> query=currentSession.createQuery("from accessoire where id_accessoire=:id_accessoire", Accessoire.class);
		query.setParameter("id_accessoire", accessoire.getIdAccessoire());
		List<Accessoire> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateAccessoire(Accessoire accessoire) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(accessoire);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
