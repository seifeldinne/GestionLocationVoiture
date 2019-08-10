package com.glv.org.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glv.org.entite.Company;

@Repository
public class CompanyDAOImp  implements ICompanyDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveCompany(Company company) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(company);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Company> getCompanys() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Company> query=currentSession.createQuery("from company", Company.class);
		List<Company> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteCompany(Company company) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(company);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Company> getCompanyByID(Company company) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Company> query=currentSession.createQuery("from company where id_company=:id_company", Company.class);
		query.setParameter("id_company", company.getIdCompany());
		List<Company> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateCompany(Company Company) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(Company);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
