package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Agency;

@Repository
public class AgencyDAOImp  implements IAgencyDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveAgency(Agency agency) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(agency);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Agency> getAgencys() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Agency> query=currentSession.createQuery("from agency", Agency.class);
		List<Agency> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteAgency(Agency Agency) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(Agency);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Agency> getAgencyByID(Agency agency) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Agency> query=currentSession.createQuery("from agency where id_agency=:id_agency", Agency.class);
		query.setParameter("id_agency", agency.getIdAgency());
		List<Agency> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateAgency(Agency agency) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(agency);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
