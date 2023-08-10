package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	
	@Column(nullable=false)
	private int idfuncionario;
	@Column(nullable=false)
	private int idcliente;
	
	
}
