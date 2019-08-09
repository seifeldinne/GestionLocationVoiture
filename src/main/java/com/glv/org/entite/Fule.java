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
@Table(name = "fule")
public class Fule implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fule")
	private Long idFule;

	@Column(name = "fule_name")
	private Long fuleName;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Car car;

	public Fule() {
		super();
	}

	public Fule(Long fuleName, Car car) {
		super();

		this.fuleName = fuleName;
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Long getIdFule() {
		return idFule;
	}

	public void setIdFule(Long idFule) {
		this.idFule = idFule;
	}

	public Long getFuleName() {
		return fuleName;
	}

	public void setFuleName(Long fuleName) {
		this.fuleName = fuleName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
