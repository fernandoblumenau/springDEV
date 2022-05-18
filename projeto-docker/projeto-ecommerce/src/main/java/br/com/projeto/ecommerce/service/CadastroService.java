package br.com.projeto.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.ecommerce.data.dto.CadastroDTO;
import br.com.projeto.ecommerce.data.entity.Cadastro;
import br.com.projeto.ecommerce.repository.CadastroRepository;


@Service
public class CadastroService {
	
	@Autowired
	CadastroRepository repository;
	
	
	public List<CadastroDTO> getAll(){
		List<Cadastro> cadastros = repository.findAll();
		List<CadastroDTO> listDTOs = new ArrayList();
		
		for (Cadastro cadastro : cadastros) {
			listDTOs.add(cadastro.getDTO());
		}
		return listDTOs;
	}

	public CadastroDTO save(CadastroDTO dto) {
		Cadastro cadastro = repository.save(dto.convertDtoToEntiy());
		return cadastro.getDTO();
	}
	
	public CadastroDTO add(CadastroDTO cadastro) {
		// TODO Auto-generated method stub
		return repository.save(cadastro.convertDtoToEntiy()).getDTO();
	}

}
