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
@Table(name = "company")
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_company")
	private Long idCompany;

	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "mail")
	private String mail;
	
	public Company(String companyName, String tel, String mail, String webSite, Agency agency) {
		super();
		this.companyName = companyName;
		this.tel = tel;
		this.mail = mail;
		this.webSite = webSite;
		this.agency = agency;
	}

	@Column(name = "web_site")
	private String webSite;

	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn	
	private Agency agency;
	
	
	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String companyName, String tel, String mail, String webSite) {
		super();
		this.companyName = companyName;
		this.tel = tel;
		this.mail = mail;
		this.webSite = webSite;
	}

	public Long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

