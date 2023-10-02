package br.com.cpti.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cpti.backend.entity.Cliente;
import br.com.cpti.backend.repository.ClienteRepository;

@RestController
@RequestMapping("/obras")
public class ClienteController {

	@Autowired
	public ClienteRepository repository;
	
	@PostMapping
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente c){
		return ResponseEntity.created(null).body(repository.save(c));
	}
	
	
}
