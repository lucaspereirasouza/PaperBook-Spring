package br.com.paperbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.repository.CargoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/Cargo")
public class CargoController {
	
	@Autowired CargoRepository cargo;
	
	
}
