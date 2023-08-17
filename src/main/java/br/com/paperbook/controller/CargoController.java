package br.com.paperbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.Cargo;
import br.com.paperbook.repository.CargoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/cargo")
public class CargoController {
	
	@Autowired CargoRepository cargo;
	
	@GetMapping("/listar")
	private List<Cargo> listar() {
		return cargo.findAll();
	}
	
	@GetMapping("/buscar/{id}")
	private Optional<Cargo> buscar(@PathVariable Integer id){
		return cargo.findById(id);
	}
	
	@PostMapping("/cadastrar")
	private String cadastrar(@RequestBody Cargo carg) {
		cargo.save(carg);
		return "Cargo cadastrado";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Integer id,@RequestBody Cargo carg) {
		
		return "Atualizado com sucesso";
	}
}
