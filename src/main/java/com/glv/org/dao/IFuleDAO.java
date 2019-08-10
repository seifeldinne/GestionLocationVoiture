package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Fule;

public interface IFuleDAO {

	public boolean saveFule(Fule fule);
	public List<Fule> getFules();
	public boolean deleteFule(Fule fule);
	public List<Fule> getFuleByID(Fule fule);
	public boolean updateFule(Fule fule);
}
