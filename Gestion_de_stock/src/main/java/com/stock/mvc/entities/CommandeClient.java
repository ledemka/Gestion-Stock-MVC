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

public class CommandeClient implements Serializable{

	@Id
	@GeneratedValue
	private Long idCommandeClient;
	
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCommande;
	@ManyToOne
    @JoinColumn(name="idClient")
	private Client client;
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;
	public Long getIdCommandeClient() {
		return idCommandeClient;
	}
	public void setIdCommandeClient(Long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDataCommande() {
		return dataCommande;
	}
	public void setDataCommande(Date dataCommande) {
		this.dataCommande = dataCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}
	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}
	
	

}
