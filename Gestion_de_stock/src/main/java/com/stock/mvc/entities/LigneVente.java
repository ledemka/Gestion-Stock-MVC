package com.stock.mvc.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class LigneVente implements Serializable {

	@Id
	@GeneratedValue
	private Long idLigneVente;
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	private Vente vente;

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

}
