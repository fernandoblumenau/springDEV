package br.com.projetosaula.anatacoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetosaula.anatacoes.data.entity.Nota;

@Repository
public interface NotasRepository extends JpaRepository<Nota, Integer>{
	
	public List<Nota> findByTituloContaining(String titulo);

}
