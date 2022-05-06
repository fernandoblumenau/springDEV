package br.com.projeto.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.ecommerce.data.entity.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
