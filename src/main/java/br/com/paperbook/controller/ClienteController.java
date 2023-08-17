package br.com.paperbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.Cliente;

import br.com.paperbook.repository.ClienteRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienterepo;	
	
	@GetMapping("/listar")
	public List<Cliente> listar() {
		return clienterepo.findAll();
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Cliente> buscar(@PathVariable Integer id) {
		return clienterepo.findById(id);
	}
	@PostMapping("/cadastrar")
	public String cadastrar(@RequestBody Cliente cli) {
		clienterepo.save(cli);
		return("Cliente cadastrado");
	}
	
	@PutMapping("/Atualizar/{id}")
	public String Atualizar(@PathVariable Integer id, @RequestBody Cliente cli) {
		String msg = "";
		Optional<Cliente> opcli = clienterepo.findById(id);
		if (opcli.isPresent()) {
			Cliente cliente = new Cliente();
			
			cliente.setIdcliente(id);
			//

			cliente.setNomecliente(cli.getNomecliente());
			cliente.setCpfcliente(cli.getCpfcliente());
			cliente.setSexocliente(cli.getSexocliente());
			cliente.setRgcliente(cli.getRgcliente());
			cliente.setDatanascimentocliente(cli.getDatanascimentocliente());
			clienterepo.save(cliente);
			msg="Enviado com sucesso";
		} else {
			msg = "Fracasso ao inviar";
		}
		return msg;
	}
	
	@DeleteMapping("/deletar/{id}")
	private String deletar(@PathVariable Integer id, @RequestBody Cliente cli) {
	clienterepo.deleteById(id);
	return "Cliente deletado";}
//	@PostMapping("/cadastrar")
//	public String cadastrar(@RequestBody Categoria cat) {
//		catRepo.save(cat);
//		return "Categoria cadastrada";
//	}
	
}
