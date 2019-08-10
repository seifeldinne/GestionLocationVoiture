package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Company;

public interface ICompanyDAO {

	public boolean saveCompany(Company company);
	public List<Company> getCompanys();
	public boolean deleteCompany(Company company);
	public List<Company> getCompanyByID(Company company);
	public boolean updateCompany(Company company);
}
