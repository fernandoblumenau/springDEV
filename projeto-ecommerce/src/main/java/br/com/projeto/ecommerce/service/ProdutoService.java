package br.com.projeto.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.ecommerce.data.dto.ProdutoDTO;
import br.com.projeto.ecommerce.data.entity.Produto;
import br.com.projeto.ecommerce.repository.ProdutoRepository;



@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository repository;
	
	
	public List<ProdutoDTO> getAll(){
		List<Produto> produtos = repository.findAll();
		List<ProdutoDTO> listDTOs = new ArrayList();
		
		for (Produto categoria : produtos) {
			listDTOs.add(categoria.getDTO());
		}
		return listDTOs;
	}
	
	public ProdutoDTO getById(Integer id) throws Exception{
		Produto produto = repository.findById(id)
					.orElseThrow(
							()-> new Exception("Categoria não encontrada") );
		return produto.getDTO();
	}
	

}
