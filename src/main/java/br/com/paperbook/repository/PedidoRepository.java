package br.com.paperbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paperbook.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
