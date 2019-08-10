package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Region;

public interface IRegionDAO {

	public boolean saveRegion(Region region);
	public List<Region> getRegions();
	public boolean deleteRegion(Region region);
	public List<Region> getRegionByID(Region region);
	public boolean updateRegion(Region region);
}
