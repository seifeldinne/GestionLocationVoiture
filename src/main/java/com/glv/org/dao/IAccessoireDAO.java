package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Accessoire;

public interface IAccessoireDAO {

	public boolean saveAccessoire(Accessoire Accessoire);
	public List<Accessoire> getAccessoires();
	public boolean deleteAccessoire(Accessoire Accessoire);
	public List<Accessoire> getAccessoireByID(Accessoire Accessoire);
	public boolean updateAccessoire(Accessoire Accessoire);
}
