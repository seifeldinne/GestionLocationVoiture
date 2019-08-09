package com.glv.org.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_car")
	private Long idCar;
	@Column(name = "serial_number")
	private String serialNumber;

	@ManyToOne
	@JoinColumn(name = "id_brand", nullable = false)
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "id_type", nullable = false)
	private TypeColor typeColor;

	@ManyToOne
	@JoinColumn(name = "id_agency", nullable = false)
	private Agency agency;
	@Column(name = "price")
	private String price;
	@ManyToOne
	@JoinColumn(name = "id_color", nullable = false)
	private Color color;
	@ManyToOne
	@JoinColumn(name = "id_fule", nullable = false)
	private Fule fule;
	@ManyToOne
	@JoinColumn(name = "id_horsePower", nullable = false)
	private HorsePower horsePower;

	@ManyToOne
	@JoinColumn(name = "id_promotion", nullable = false)
	private Promotion promotion;

	@Column(name = "start_date")
	private String startDate;

	public Car(String serialNumber, Brand brand, TypeColor typeColor, Agency agency, String price, Color color,
			Fule fule, HorsePower horsePower, Promotion promotion, String startDate, String lastDate,
			Boolean available) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.typeColor = typeColor;
		this.agency = agency;
		this.price = price;
		this.color = color;
		this.fule = fule;
		this.horsePower = horsePower;
		this.promotion = promotion;
		this.startDate = startDate;
		this.lastDate = lastDate;
		this.available = available;
	}

	public TypeColor getTypeColor() {
		return typeColor;
	}

	public void setTypeColor(TypeColor typeColor) {
		this.typeColor = typeColor;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Fule getFule() {
		return fule;
	}

	public void setFule(Fule fule) {
		this.fule = fule;
	}

	public HorsePower getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(HorsePower horsePower) {
		this.horsePower = horsePower;
	}

	@Column(name = "last_date")
	private String lastDate;
	@Column(name = "available")
	private Boolean available;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Car(String serialNumber, Brand idBraind, Agency idAgency, String price, Color idColor, Fule idFuel,
			HorsePower idHorsePower, Promotion idPromotion, String startDate, String lastDate, Boolean available) {
		super();
		this.serialNumber = serialNumber;
		this.brand = idBraind;
		this.agency = idAgency;
		this.price = price;
		this.color = idColor;
		this.fule = idFuel;
		this.horsePower = idHorsePower;
		this.promotion = idPromotion;
		this.startDate = startDate;
		this.lastDate = lastDate;
		this.available = available;
	}

	public Long getIdCar() {
		return idCar;
	}

	public Car() {
		super();
	}

	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Color getIdColor() {
		return color;
	}

	public void setIdColor(Color idColor) {
		this.color = idColor;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

}
