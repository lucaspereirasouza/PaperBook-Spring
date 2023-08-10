package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcliente;
	
	@Column(length = 50, nullable = false)
	private String nomecliente;
	@Column(length = 15, nullable = false)
	private String cpfcliente;
	@Column(length = 15, nullable = false)
	private String sexocliente;
	@Column(length = 15, nullable = false)
	//Na via das duvidas mudar Date para outra importação
	private Date datanascimentocliente;
	@Column(length = 15, nullable = false)
	private String rgcliente;
	
	
	@Column(nullable = false)
	private Integer idendereco;
	@Column(nullable = false)
	private Integer idcontato;
	@Column(nullable = false)
	private Integer idusuario;
	
	public Cliente() {}

	public Cliente(Integer idcliente, String nomecliente, String cpfcliente, String sexocliente,
			Date datanascimentocliente, String rgcliente, Integer idendereco, Integer idcontato, Integer idusuario) {
	
		this.idcliente = idcliente;
		this.nomecliente = nomecliente;
		this.cpfcliente = cpfcliente;
		this.sexocliente = sexocliente;
		this.datanascimentocliente = datanascimentocliente;
		this.rgcliente = rgcliente;
		this.idendereco = idendereco;
		this.idcontato = idcontato;
		this.idusuario = idusuario;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public String getCpfcliente() {
		return cpfcliente;
	}

	public void setCpfcliente(String cpfcliente) {
		this.cpfcliente = cpfcliente;
	}

	public String getSexocliente() {
		return sexocliente;
	}

	public void setSexocliente(String sexocliente) {
		this.sexocliente = sexocliente;
	}

	public Date getDatanascimentocliente() {
		return datanascimentocliente;
	}

	public void setDatanascimentocliente(Date datanascimentocliente) {
		this.datanascimentocliente = datanascimentocliente;
	}

	public String getRgcliente() {
		return rgcliente;
	}

	public void setRgcliente(String rgcliente) {
		this.rgcliente = rgcliente;
	}

	public Integer getIdendereco() {
		return idendereco;
	}

	public void setIdendereco(Integer idendereco) {
		this.idendereco = idendereco;
	}

	public Integer getIdcontato() {
		return idcontato;
	}

	public void setIdcontato(Integer idcontato) {
		this.idcontato = idcontato;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	
	
	
	
}
