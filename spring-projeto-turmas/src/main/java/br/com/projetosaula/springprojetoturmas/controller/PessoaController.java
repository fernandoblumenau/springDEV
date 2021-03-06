package br.com.projetosaula.springprojetoturmas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import br.com.projetosaula.springprojetoturmas.entity.Pessoa;
import br.com.projetosaula.springprojetoturmas.repository.PessoaRepository;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping
	public List<Pessoa> getAll(){			
		return pessoaRepository.findAll();
	}	
	
	
	@PostMapping
	public ResponseEntity<Pessoa> addPessoa(@RequestBody Pessoa pessoa){
		
		Pessoa pessoaResponse = pessoaRepository.save(pessoa);
		
		return new ResponseEntity<Pessoa>(pessoaResponse, HttpStatus.CREATED);
	}
	
	
	
	
}
