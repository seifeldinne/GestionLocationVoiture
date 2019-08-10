package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Color;

public interface IColorDAO {

	public boolean saveColor(Color color);
	public List<Color> getColors();
	public boolean deleteColor(Color color);
	public List<Color> getColorByID(Color color);
	public boolean updateColor(Color color);
}
