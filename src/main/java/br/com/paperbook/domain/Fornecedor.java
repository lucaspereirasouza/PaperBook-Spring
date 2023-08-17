package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity 
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idfornecedor;
	@Column(length = 30,nullable=false)
	private String razaosocial;
	@Column(length = 15,nullable = false)
	private String cnpj;
	@Column(length = 100,nullable = false)
	private String tipodeproduto;
	
	@ManyToOne
	@JoinColumn(name="idendereco")
	private Endereco endereco;
	@OneToOne
	@JoinColumn(name="idcontato")
	private Contato contato;
	
	public Fornecedor() {}

	public Fornecedor(Integer idfornecedor, String razaosocial, String cnpj, String tipodeproduto, Endereco endereco,
			Contato contato) {
		this.idfornecedor = idfornecedor;
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
		this.tipodeproduto = tipodeproduto;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Integer getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(Integer idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipodeproduto() {
		return tipodeproduto;
	}

	public void setTipodeproduto(String tipodeproduto) {
		this.tipodeproduto = tipodeproduto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	
	
}
