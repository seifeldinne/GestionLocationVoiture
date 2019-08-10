package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.HorsePower;

public interface IHorsePowerDAO {

	public boolean saveHorsePower(HorsePower horsePower);
	public List<HorsePower> getHorsePowers();
	public boolean deleteHorsePower(HorsePower horsePower);
	public List<HorsePower> getHorsePowerByID(HorsePower horsePower);
	public boolean updateHorsePower(HorsePower horsePower);
}
