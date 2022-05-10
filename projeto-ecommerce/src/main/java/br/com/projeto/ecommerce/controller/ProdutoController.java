package br.com.projeto.ecommerce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.ecommerce.data.dto.ProdutoDTO;
import br.com.projeto.ecommerce.service.ProdutoService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	ProdutoService service;
	
	@GetMapping
	public List<ProdutoDTO> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ProdutoDTO getById(@PathVariable("id") Integer id) throws Exception{
		return service.getById(id);
	}
		
}
