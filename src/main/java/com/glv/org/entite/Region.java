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
@Table(name = "region")
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_region")
	private Long idRegion;

	@Column(name = "name_region")
	private Long nameRegion;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Client client;

	public Region(Long nameRegion, Client client) {
		super();
		this.nameRegion = nameRegion;
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Long getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Long idRegion) {
		this.idRegion = idRegion;
	}

	public Long getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(Long nameRegion) {
		this.nameRegion = nameRegion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Region(Long nameRegion) {
		super();
		this.nameRegion = nameRegion;
	}

	public Region() {
		super();

	}

}
