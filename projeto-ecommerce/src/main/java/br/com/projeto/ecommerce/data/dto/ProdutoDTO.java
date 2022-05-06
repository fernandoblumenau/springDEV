package br.com.projeto.ecommerce.data.dto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idProduto;
	private String nomeProduto;
	private Double valorProduto; 
	private boolean promocaoProduto;
	private Double valorPromoProduto;
	private String imagemProduto;
	
	
	public ProdutoDTO() {
		super();
	}

	public ProdutoDTO(Integer idProduto, String nomeProduto, Double valorProduto, boolean promocaoProduto,
			Double valorPromoProduto, String imagemProduto) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
		this.promocaoProduto = promocaoProduto;
		this.valorPromoProduto = valorPromoProduto;
		this.imagemProduto = imagemProduto;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public boolean isPromocaoProduto() {
		return promocaoProduto;
	}

	public void setPromocaoProduto(boolean promocaoProduto) {
		this.promocaoProduto = promocaoProduto;
	}

	public Double getValorPromoProduto() {
		return valorPromoProduto;
	}

	public void setValorPromoProduto(Double valorPromoProduto) {
		this.valorPromoProduto = valorPromoProduto;
	}

	public String getImagemProduto() {
		return imagemProduto;
	}

	public void setImagemProduto(String imagemProduto) {
		this.imagemProduto = imagemProduto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
