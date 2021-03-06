package br.com.projetosaula.primeiroprojetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetosaula.primeiroprojetospring.entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{
	
	public Filme findByGenero(String genero);

}
