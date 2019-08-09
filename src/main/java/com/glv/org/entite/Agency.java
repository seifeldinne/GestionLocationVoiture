package com.glv.org.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "agency")
public class Agency implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agency")
	private Long idAgency;
	@ManyToOne
	@JoinColumn(name = "id_company", nullable = false)
	private Company company;
	@Column(name = "name_agency")
	private String nameAgency;

	@Column(name = "mail")
	private String mail;

	@Column(name = "serial_number")
	private String serialNumber;

	@Column(name = "langitude")
	private String langitude;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "adresse")
	private String adresse;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Car car;

	public Agency(Company idCompany, String nameAgency, String mail, String serialNumber, String langitude,
			String latitude, String adresse, Car car) {
		super();
		this.company = idCompany;
		this.nameAgency = nameAgency;
		this.mail = mail;
		this.serialNumber = serialNumber;
		this.langitude = langitude;
		this.latitude = latitude;
		this.adresse = adresse;
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Agency() {
		super();
	}

	public Agency(Company idCompany, String nameAgency, String mail, String serialNumber, String langitude,
			String latitude, String adresse) {
		super();
		this.company = idCompany;
		this.nameAgency = nameAgency;
		this.mail = mail;
		this.serialNumber = serialNumber;
		this.langitude = langitude;
		this.latitude = latitude;
		this.adresse = adresse;
	}

	public Long getIdAgency() {
		return idAgency;
	}

	public void setIdAgency(Long idAgency) {
		this.idAgency = idAgency;
	}


	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getNameAgency() {
		return nameAgency;
	}

	public void setNameAgency(String nameAgency) {
		this.nameAgency = nameAgency;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLangitude() {
		return langitude;
	}

	public void setLangitude(String langitude) {
		this.langitude = langitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
