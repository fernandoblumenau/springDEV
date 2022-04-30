package br.com.projetosaula.anatacoes.data.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.projetosaula.anatacoes.data.entity.Categoria;
import br.com.projetosaula.anatacoes.data.entity.Nota;

public class NotaDTO implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private Integer idNota;
	private String tituloNota;
	private String textoAnotacao;
	private CategoriaDTO categoria;
	
	
	public NotaDTO() {
		super();
	}


	public NotaDTO(Integer idNota, String tituloNota, String textoAnotacao, CategoriaDTO categoria) {
		super();
		this.idNota = idNota;
		this.tituloNota = tituloNota;
		this.textoAnotacao = textoAnotacao;
		this.categoria = categoria;
	}


	public Nota convertToEntity() {
		return new Nota(getIdNota(),
				getTituloNota(),
				getTextoAnotacao(),
				getCategoria().convertDtoToEntiy());
	}
	
	
	
	public Integer getIdNota() {
		return idNota;
	}


	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
	}


	public String getTituloNota() {
		return tituloNota;
	}


	public void setTituloNota(String tituloNota) {
		this.tituloNota = tituloNota;
	}


	public String getTextoAnotacao() {
		return textoAnotacao;
	}


	public void setTextoanotacao(String textoAnotacao) {
		this.textoAnotacao = textoAnotacao;
	}


	public CategoriaDTO getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	
}
