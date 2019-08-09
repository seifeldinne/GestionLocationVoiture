package com.glv.org.entite;

import java.io.Serializable;

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
@Table(name = "brand")
public class Brand implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_brand")
	private Long idBrand;
	@Column(name = "brand_name")
	private Long brandName;
	@Column(name = "brand_model")
	private Long brandModel;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn	
	private Car car;
	
	public Brand(Long brandName, Long brandModel, Car car) {
		super();
		this.brandName = brandName;
		this.brandModel = brandModel;
		this.car = car;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Long getIdBrand() {
		return idBrand;
	}
	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
	}
	public Long getBrandName() {
		return brandName;
	}
	public void setBrandName(Long brandName) {
		this.brandName = brandName;
	}
	public Long getBrandModel() {
		return brandModel;
	}
	public void setBrandModel(Long brandModel) {
		this.brandModel = brandModel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Brand() {
		super();

	}
	public Brand(Long brandName, Long brandModel) {
		super();
		this.brandName = brandName;
		this.brandModel = brandModel;
	}
	
}
