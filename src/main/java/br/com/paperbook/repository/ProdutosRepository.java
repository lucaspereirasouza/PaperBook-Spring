package br.com.paperbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paperbook.domain.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Integer> {

}
