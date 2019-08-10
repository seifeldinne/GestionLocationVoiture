package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Country;

public interface ICountryDAO {

	public boolean saveCountry(Country country);
	public List<Country> getCountrys();
	public boolean deleteCountry(Country country);
	public List<Country> getCountryByID(Country country);
	public boolean updateCountry(Country country);
}
