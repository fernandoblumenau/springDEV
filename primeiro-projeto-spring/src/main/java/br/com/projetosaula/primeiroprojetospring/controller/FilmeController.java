package br.com.projetosaula.primeiroprojetospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetosaula.primeiroprojetospring.entity.Filme;
import br.com.projetosaula.primeiroprojetospring.repository.FilmeRepository;

@CrossOrigin("*")
@RestController()
@RequestMapping("/filmes")
public class FilmeController {

	@Autowired
	FilmeRepository filmeRepository;
	
	public FilmeController() {}
	
	@GetMapping
	public List<Filme> getList(){
		
		return filmeRepository.findAll();
		
		
	}

	@GetMapping("/{titulo}")
	public Filme  getFilmeByTitulo(@PathVariable("titulo") String titulo){
		
		return filmeRepository.findByTitulo(titulo);
		
		
	}
	
	
}
