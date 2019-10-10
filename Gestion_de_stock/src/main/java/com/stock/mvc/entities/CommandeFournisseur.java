package com.stock.mvc.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CommandeFournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idCommandeFournisseur;

	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCommandeFournisseur;
	@ManyToOne
    @JoinColumn(name="idFournisseur")
	private Client client;
	@OneToMany(mappedBy="commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
	public Long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}
	public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
		this.idCommandeFournisseur = idCommandeFournisseur;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDataCommandeFournisseur() {
		return dataCommandeFournisseur;
	}
	public void setDataCommandeFournisseur(Date dataCommandeFournisseur) {
		this.dataCommandeFournisseur = dataCommandeFournisseur;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return ligneCommandeFournisseurs;
	}
	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
	}
	
	
}
