package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Agency;

public interface IAgencyDAO {

	public boolean saveAgency(Agency Agency);
	public List<Agency> getAgencys();
	public boolean deleteAgency(Agency Agency);
	public List<Agency> getAgencyByID(Agency Agency);
	public boolean updateAgency(Agency Agency);
}
