package br.com.paperbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paperbook.domain.Lote;

public interface LoteRepository extends JpaRepository<Lote, Integer> {

}
