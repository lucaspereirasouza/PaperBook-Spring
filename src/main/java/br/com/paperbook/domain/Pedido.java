package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPedido;
	
	@Column(length = 45,nullable = false)
	private String loja;
	@Column(length = 45,nullable = false)
	private String unidadeloja;
	@Column(length = 20,nullable = false)
	private String numeroprotocolo;
	@Column(length = 15,nullable = false)
	private String formapagamento;
	
	@Column(length = 20)
	private String parcelas;
	@Column(precision = 2)
	private Double valorpacela;
	@Column(precision = 2,nullable = false)
	private Double valortotalpedido;
	@Column(nullable = false)
	private Date datahora;
	
//	@OneToMany
	@JoinColumn(name="idfuncionario")
	private int funcionario;
//	@ManyToOne
	@JoinColumn(name="idcliente")
	private int cliente;
	
	public Pedido() {}
	public Pedido(Integer idPedido, String loja, String unidadeloja, String numeroprotocolo, String formapagamento,
			String parcelas, Double valorpacela, Double valortotalpedido, Date datahora, int idfuncionario,
			int idcliente) {
		this.idPedido = idPedido;
		this.loja = loja;
		this.unidadeloja = unidadeloja;
		this.numeroprotocolo = numeroprotocolo;
		this.formapagamento = formapagamento;
		this.parcelas = parcelas;
		this.valorpacela = valorpacela;
		this.valortotalpedido = valortotalpedido;
		this.datahora = datahora;
		this.funcionario = idfuncionario;
		this.cliente = idcliente;
	}
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}
	public String getUnidadeloja() {
		return unidadeloja;
	}
	public void setUnidadeloja(String unidadeloja) {
		this.unidadeloja = unidadeloja;
	}
	public String getNumeroprotocolo() {
		return numeroprotocolo;
	}
	public void setNumeroprotocolo(String numeroprotocolo) {
		this.numeroprotocolo = numeroprotocolo;
	}
	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}
	public String getParcelas() {
		return parcelas;
	}
	public void setParcelas(String parcelas) {
		this.parcelas = parcelas;
	}
	public Double getValorpacela() {
		return valorpacela;
	}
	public void setValorpacela(Double valorpacela) {
		this.valorpacela = valorpacela;
	}
	public Double getValortotalpedido() {
		return valortotalpedido;
	}
	public void setValortotalpedido(Double valortotalpedido) {
		this.valortotalpedido = valortotalpedido;
	}
	public Date getDatahora() {
		return datahora;
	}
	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}
	public int getIdfuncionario() {
		return funcionario;
	}
	public void setIdfuncionario(int idfuncionario) {
		this.funcionario = idfuncionario;
	}
	public int getIdcliente() {
		return cliente;
	}
	public void setIdcliente(int idcliente) {
		this.cliente = idcliente;
	}
	
}
