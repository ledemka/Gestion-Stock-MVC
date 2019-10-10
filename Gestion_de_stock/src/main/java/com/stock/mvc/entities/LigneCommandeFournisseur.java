package com.stock.mvc.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class LigneCommandeFournisseur implements Serializable {

	@Id
	@GeneratedValue
	private Long idLigneCommandeFournisseur;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeClient commandeFournisseur;

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(Long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeClient commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

}
