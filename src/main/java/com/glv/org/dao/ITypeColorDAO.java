package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.TypeColor;

public interface ITypeColorDAO {

	public boolean saveTypeColor(TypeColor typeColor);
	public List<TypeColor> getTypeColors();
	public boolean deleteTypeColor(TypeColor typeColor);
	public List<TypeColor> getTypeColorByID(TypeColor typeColor);
	public boolean updateTypeColor(TypeColor typeColor);
}
