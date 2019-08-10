package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.TypeColor;

@Repository
public class TypeColorDAOImp  implements ITypeColorDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveTypeColor(TypeColor typeColor) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(typeColor);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<TypeColor> getTypeColors() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<TypeColor> query=currentSession.createQuery("from typeColor", TypeColor.class);
		List<TypeColor> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteTypeColor(TypeColor typeColor) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(typeColor);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<TypeColor> getTypeColorByID(TypeColor typeColor) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<TypeColor> query=currentSession.createQuery("from typeColor where id_type=:id_TypeColor", TypeColor.class);
		query.setParameter("id_TypeColor", typeColor.getIdTypeColor());
		List<TypeColor> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateTypeColor(TypeColor typeColor) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(typeColor);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
