package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idusuario;
	@Column(length = 20, nullable=false)
	private String login;
	@Column(length = 255, nullable=false)
	private String senha;
	@Column(length = 45, nullable=false)
	private String nivelacesso;
	
	public Usuario() {}
	
	public Usuario(Integer idusuario, String login, String senha, String nivelAcesso) {
		this.idusuario = idusuario;
		this.login = login;
		this.senha = senha;
		this.nivelacesso = nivelAcesso;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivelAcesso() {
		return nivelacesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelacesso = nivelAcesso;
	}
	
	
}
