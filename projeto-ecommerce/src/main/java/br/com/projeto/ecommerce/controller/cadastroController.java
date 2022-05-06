package br.com.projeto.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.ecommerce.data.dto.CadastroDTO;
import br.com.projeto.ecommerce.service.CadastroService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/cadastros")
public class cadastroController {

	


		@Autowired
		CadastroService service;
		
		@GetMapping
		public List<CadastroDTO> getAll(){
			return service.getAll();
		}
		
		@PostMapping
		public ResponseEntity<CadastroDTO> addCadastro(@RequestBody CadastroDTO cadastro) {
			return new ResponseEntity<> (service.add(cadastro), HttpStatus.CREATED);
		}
			

}
