package br.com.paperbook.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detalhepedido")
public class DetalhePedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddetalhepedido;
	@Column(nullable = false)
	private int quantidade;
	@Column(precision = 2,nullable = false)
	private double valortotal;
	@Column(precision = 2,nullable = false)
	private double precounitario;
	@OneToOne
	@JoinColumn(name="idpedido")
	private Pedido pedido;
	@OneToMany
	@JoinColumn(name="idproduto")
	private List<Produto> produto;
	
	public DetalhePedido() {}
	public DetalhePedido(Integer iddetalhepedido, int quantidade, double valortotal, double precounitario,
			Pedido pedido, List<Produto> produto) {
		this.iddetalhepedido = iddetalhepedido;
		this.quantidade = quantidade;
		this.valortotal = valortotal;
		this.precounitario = precounitario;
		this.pedido = pedido;
		this.produto = produto;
	}
	public Integer getIddetalhepedido() {
		return iddetalhepedido;
	}
	public void setIddetalhepedido(Integer iddetalhepedido) {
		this.iddetalhepedido = iddetalhepedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValortotal() {
		return valortotal;
	}
	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	public double getPrecounitario() {
		return precounitario;
	}
	public void setPrecounitario(double precounitario) {
		this.precounitario = precounitario;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}
