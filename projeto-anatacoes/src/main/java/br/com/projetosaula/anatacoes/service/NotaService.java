package br.com.projetosaula.anatacoes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetosaula.anatacoes.data.dto.NotaDTO;
import br.com.projetosaula.anatacoes.data.entity.Nota;
import br.com.projetosaula.anatacoes.repository.NotasRepository;

@Service
public class NotaService {
	
	@Autowired
	NotasRepository repository;
	
	public List<NotaDTO> getall(){
		
		List<Nota> notas = repository.findAll();
		List<NotaDTO> listaNotasDTO = new ArrayList();
		for (Nota nota : notas) {
			listaNotasDTO.add(nota.getDTO());			
		}
		return listaNotasDTO;
	}

	public NotaDTO getById(Integer id) throws Exception {
		Nota nota = repository.findById(id)
								.orElseThrow(
										()-> new Exception("Nota não encontrada"));
		
		return nota.getDTO();
	}

	public NotaDTO add(NotaDTO nota) {
		// TODO Auto-generated method stub
		return repository.save(nota.convertToEntity()).getDTO();
	}
	
}
