package br.com.cpti.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cpti.backend.entity.Obra;
import br.com.cpti.backend.repository.ObraRepository;

@RestController
@RequestMapping("/obras")
public class ObraController {

	@Autowired
	public ObraRepository repository;
	
	@PostMapping
	public ResponseEntity<Obra> inserirObra(@RequestBody Obra o){
		return ResponseEntity.created(null).body(repository.save(o));
	}
	
	@GetMapping
	public ResponseEntity<List<Obra>> listarObra(){
		return ResponseEntity.ok(repository.findAll());
	}
	
}
