package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcargo;
	@Column(length = 50,nullable=false)
	private String titulocargo;
	@Column(precision = 2,nullable=false)
	private Double salario;
	@Column(length = 100,nullable=false)
	private String beneficio;
	@Column(length = 50,nullable=false)
	private String cargarhoraria;
	
	public Cargo() {}

	public Cargo(Integer idcargo, String titulocargo, Double salario, String beneficio, String cargarhoraria) {
		this.idcargo = idcargo;
		this.titulocargo = titulocargo;
		this.salario = salario;
		this.beneficio = beneficio;
		this.cargarhoraria = cargarhoraria;
	}

	public Integer getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(Integer idcargo) {
		this.idcargo = idcargo;
	}

	public String getTitulocargo() {
		return titulocargo;
	}

	public void setTitulocargo(String titulocargo) {
		this.titulocargo = titulocargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	public String getCargarhoraria() {
		return cargarhoraria;
	}

	public void setCargarhoraria(String cargarhoraria) {
		this.cargarhoraria = cargarhoraria;
	}

	
	
	
}
