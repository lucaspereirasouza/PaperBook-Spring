package br.com.paperbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.Usuario;
import br.com.paperbook.repository.UsuarioRepository;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository userRepo;
	
	@PostMapping("/login")
	public String login(@RequestBody Usuario usuario) {
		String msg = "";
		Usuario rs = userRepo.findByLogin(usuario.getLogin());
		if (rs.getSenha().equals(usuario.getSenha())) {
			msg="Logou";
		}else {
			msg="Login ou senha não existe";
		}
		return msg;
	}
	@PostMapping("/cadastrar")
	public String cadastrar(@RequestBody Usuario usu) {
		userRepo.save(usu);
		return "Usuario cadastrado";
	}
}
