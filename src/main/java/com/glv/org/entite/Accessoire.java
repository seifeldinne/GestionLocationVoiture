package com.glv.org.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accessoire")
public class Accessoire implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_accessoire")
	private Long idAccessoire;
	
	@Column(name = "NameAccessoire")
	private String nameAccessoire;
	
	@Column(name = "quantite")
	private int quantite;
	
	@Column(name = "size")
	private int size;

	public Long getIdAccessoire() {
		return idAccessoire;
	}

	public void setIdAccessoire(Long idAccessoire) {
		this.idAccessoire = idAccessoire;
	}

	public String getNameAccessoire() {
		return nameAccessoire;
	}

	public void setNameAccessoire(String nameAccessoire) {
		this.nameAccessoire = nameAccessoire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Accessoire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accessoire(String nameAccessoire, int quantite, int size) {
		super();
		this.nameAccessoire = nameAccessoire;
		this.quantite = quantite;
		this.size = size;
	}
	
}
