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
@Table(name = "type_color")
public class TypeColor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_color")
	private Long idTypeColor;

	@Column(name = "type_name")
	private String TypeName;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn	
	private Car car;
	
	public TypeColor(String typeName) {
		super();
		TypeName = typeName;
	}

	public TypeColor() {
		super();
	}

	public Long getIdTypeColor() {
		return idTypeColor;
	}

	public void setIdTypeColor(Long idTypeColor) {
		this.idTypeColor = idTypeColor;
	}

	public String getTypeName() {
		return TypeName;
	}

	public void setTypeName(String typeName) {
		TypeName = typeName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
