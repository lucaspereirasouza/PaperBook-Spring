package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
public class Lote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idlote;
	@Column(length = 10,nullable = false)
	private String numerolote;
	@Column(nullable = false)
	private Date date;
	@Column(nullable = false)
	private Date validade;
	
	public Lote() {}

	public Lote(Integer idlote, String numerolote, Date date, Date validade) {
		this.idlote = idlote;
		this.numerolote = numerolote;
		this.date = date;
		this.validade = validade;
	}

	public Integer getIdlote() {
		return idlote;
	}

	public void setIdlote(Integer idlote) {
		this.idlote = idlote;
	}

	public String getNumerolote() {
		return numerolote;
	}

	public void setNumerolote(String numerolote) {
		this.numerolote = numerolote;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	

}
