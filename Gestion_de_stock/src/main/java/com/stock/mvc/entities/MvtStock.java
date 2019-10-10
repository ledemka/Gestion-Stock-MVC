package com.stock.mvc.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class MvtStock implements Serializable {

	public static final int ENTREE = 1;

	public static final int SORTIE = 2;

	@Id
	@GeneratedValue
	private Long idMvtStock;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;

	private BigDecimal qnt;

	private int typeMvt;
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	public Long getIdMvtStock() {
		return idMvtStock;
	}

	public void setIdMvtStock(Long idMvtStock) {
		this.idMvtStock = idMvtStock;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQnt() {
		return qnt;
	}

	public void setQnt(BigDecimal qnt) {
		this.qnt = qnt;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}
