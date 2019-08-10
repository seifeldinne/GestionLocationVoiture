package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Brand;

public interface IBrandDAO {

	public boolean saveBrand(Brand brand);
	public List<Brand> getBrands();
	public boolean deleteBrand(Brand brand);
	public List<Brand> getBrandByID(Brand brand);
	public boolean updateBrand(Brand brand);
}
