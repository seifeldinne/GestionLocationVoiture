package com.glv.org.entite;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "promotion")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_promotion")
	private Long idPromotion;

	@Column(name = "percent_reduction")
	private int percentReduction;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "last_date")
	private Date lastDate;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn	
	private Car car;
	
	
	public Promotion(int percentReduction, Date startDate, Date lastDate, Car car) {
		super();
		this.percentReduction = percentReduction;
		this.startDate = startDate;
		this.lastDate = lastDate;
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Long getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(Long idPromotion) {
		this.idPromotion = idPromotion;
	}

	public int getPercentReduction() {
		return percentReduction;
	}

	public void setPercentReduction(int percentReduction) {
		this.percentReduction = percentReduction;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Promotion(int percentReduction, Date startDate, Date lastDate) {
		super();
		this.percentReduction = percentReduction;
		this.startDate = startDate;
		this.lastDate = lastDate;
	}

	public Promotion() {
		super();
	
	}

}
