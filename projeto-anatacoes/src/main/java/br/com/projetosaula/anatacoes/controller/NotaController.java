package br.com.projetosaula.anatacoes.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetosaula.anatacoes.data.dto.NotaDTO;
import br.com.projetosaula.anatacoes.service.NotaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/notas")
public class NotaController {
	
	@Autowired
	NotaService service;
	
	@GetMapping
	public List<NotaDTO> getAll(){
		return service.getall();
	}

	@GetMapping("/{id}")
	public NotaDTO getById(@PathVariable("id") Integer id) throws Exception{
		return service.getById(id);
	}
	
	
	@PostMapping
	public ResponseEntity<NotaDTO> addNota(@RequestBody NotaDTO nota) {
		return new ResponseEntity<> (service.add(nota), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> delNota(@PathVariable("id") Integer id) throws Exception{
		return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
		
	}
	
	@PutMapping
	public ResponseEntity<NotaDTO> update(@RequestBody NotaDTO nota) throws Exception{
		return new ResponseEntity<> (service.update(nota), HttpStatus.CREATED);		
	}
	
	
}
