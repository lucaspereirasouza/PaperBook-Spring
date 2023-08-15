package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproduto;
	@Column(length = 50)
	private String nomeproduto;
	@Column(length = 255)
	private String descricaoproduto;
	@Column(length = 200)
	private String codigobarras;
	@Column(precision = 2)
	private double preco;
	@Column(length = 200)
	private String observacao;

	@OneToOne
	@JoinColumn(name = "idfornecedor")
	private Fornecedor fornecedor;
	@OneToOne
	@JoinColumn(name="idlote")
	private Lote lote;
	@OneToOne
	@JoinColumn(name="idcategoria")
	private Categoria categoria;
	
	public Produto() {}

	public Produto(Integer idproduto, String nomeproduto, String descricaoproduto, String codigobarras, double preco,
			String observacao, Fornecedor fornecedor, Lote lote, Categoria categoria) {
		this.idproduto = idproduto;
		this.nomeproduto = nomeproduto;
		this.descricaoproduto = descricaoproduto;
		this.codigobarras = codigobarras;
		this.preco = preco;
		this.observacao = observacao;
		this.fornecedor = fornecedor;
		this.lote = lote;
		this.categoria = categoria;
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	public String getCodigobarras() {
		return codigobarras;
	}

	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
