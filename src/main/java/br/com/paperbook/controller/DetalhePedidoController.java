package br.com.paperbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.DetalhePedido;
import br.com.paperbook.repository.DetalhePedidoRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/detalhepedido")
public class DetalhePedidoController {
	@Autowired
	private DetalhePedidoRepository detalhepedidorepo;
	
	@GetMapping("/listar")
	public List<DetalhePedido> Listar(){
		return detalhepedidorepo.findAll();
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<DetalhePedido> buscar(@RequestBody DetalhePedido detalhe, @PathVariable Integer id ){
		return detalhepedidorepo.findById(id);
	}
}
