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
@Table(name = "horse_power")
public class HorsePower implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_horse")
	private Long idHorse;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn	
	private Car car;
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public HorsePower(int numberHorse) {
		super();
		
		this.numberHorse = numberHorse;
	}

	public HorsePower() {
		super();
	
	}

	public Long getIdHorse() {
		return idHorse;
	}

	public void setIdHorse(Long idHorse) {
		this.idHorse = idHorse;
	}

	public int getNumberHorse() {
		return numberHorse;
	}

	public void setNumberHorse(int numberHorse) {
		this.numberHorse = numberHorse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "number_horse")
	private int numberHorse;

}
