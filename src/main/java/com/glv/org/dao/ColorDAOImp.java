package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Color;

@Repository
public class ColorDAOImp  implements IColorDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveColor(Color color) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(color);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Color> getColors() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Color> query=currentSession.createQuery("from color", Color.class);
		List<Color> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteColor(Color color) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(color);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Color> getColorByID(Color color) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Color> query=currentSession.createQuery("from color where id_color=:id_color", Color.class);
		query.setParameter("id_color", color.getIdColor());
		List<Color> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateColor(Color color) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(color);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
