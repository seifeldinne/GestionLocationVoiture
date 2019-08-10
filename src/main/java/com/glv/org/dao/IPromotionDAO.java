package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Promotion;

public interface IPromotionDAO {

	public boolean savePromotion(Promotion promotion);
	public List<Promotion> getPromotions();
	public boolean deletePromotion(Promotion promotion);
	public List<Promotion> getPromotionByID(Promotion promotion);
	public boolean updatePromotion(Promotion promotion);
}
