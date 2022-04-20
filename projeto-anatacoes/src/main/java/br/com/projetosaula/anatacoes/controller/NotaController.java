package br.com.projetosaula.anatacoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}
