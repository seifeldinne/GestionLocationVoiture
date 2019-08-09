package com.glv.org.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_country")
	private Long idContry;

	@Column(name = "name_country")
	private String nameCountry;

	public Long getIdContry() {
		return idContry;
	}

	public void setIdContry(Long idContry) {
		this.idContry = idContry;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Country(String nameCountry) {
		super();
		this.nameCountry = nameCountry;
	}

	public Country() {
		super();

	}

}
