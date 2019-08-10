package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Promotion;

@Repository
public class PromotionDAOImp  implements IPromotionDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean savePromotion(Promotion Promotion) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(Promotion);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Promotion> getPromotions() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Promotion> query=currentSession.createQuery("from promotion", Promotion.class);
		List<Promotion> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deletePromotion(Promotion Promotion) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(Promotion);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Promotion> getPromotionByID(Promotion Promotion) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Promotion> query=currentSession.createQuery("from promotion where id_promotion=:id_Promotion", Promotion.class);
		query.setParameter("id_Promotion", Promotion.getIdPromotion());
		List<Promotion> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updatePromotion(Promotion Promotion) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(Promotion);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
