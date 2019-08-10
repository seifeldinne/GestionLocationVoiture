package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Region;

@Repository
public class RegionDAOImp implements IRegionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveRegion(Region region) {
		boolean status = false;
		try {
			sessionFactory.getCurrentSession().save(region);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Region> getRegions() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Region> query = currentSession.createQuery("from region", Region.class);
		List<Region> list = query.getResultList();
		return list;
	}

	@Override
	public boolean deleteRegion(Region region) {
		boolean status = false;
		try {
			sessionFactory.getCurrentSession().delete(region);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Region> getRegionByID(Region region) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Region> query = currentSession.createQuery("from region where id_region=:id_Region", Region.class);
		query.setParameter("id_Region", region.getIdRegion());
		List<Region> list = query.getResultList();
		return list;
	}

	@Override
	public boolean updateRegion(Region region) {
		boolean status = false;
		try {
			sessionFactory.getCurrentSession().update(region);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
