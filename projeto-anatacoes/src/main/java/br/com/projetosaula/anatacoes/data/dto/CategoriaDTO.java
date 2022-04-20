package br.com.projetosaula.anatacoes.data.dto;

import java.io.Serializable;

import br.com.projetosaula.anatacoes.data.entity.Categoria;

public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idCategoria;
	private String descricaoCategoria;
	private boolean flAtivo;
	
	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(Integer idCategoria, String descricaoCategoria, Boolean flAtivo) {
		super();
		this.idCategoria = idCategoria;
		this.descricaoCategoria = descricaoCategoria;
		this.flAtivo = flAtivo;
	}

	
	public Categoria convertDtoToEntiy() {
	return new Categoria(	getIdCategoria(),
										getDescricaoCategoria(),
										isFlAtivo());
										
	}
	
	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public boolean isFlAtivo() {
		return flAtivo;
	}

	public void setFlAtivo(boolean flAtivo) {
		this.flAtivo = flAtivo;
	}


	
	
	
}
