package br.com.projeto.ecommerce.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.projeto.ecommerce.data.dto.ProdutoDTO;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double valor; 
//	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean promocao;
	private Double valorPromo;
	private String imagem;
	 
	 
	public Produto() {
		super();
	}

	public Produto(Integer id, String nome, Double valor, boolean promocao, Double valorPromo, String imagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.promocao = promocao;
		this.valorPromo = valorPromo;
		this.imagem = imagem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public Double getValorPromo() {
		return valorPromo;
	}

	public void setValorPromo(Double valorPromo) {
		this.valorPromo = valorPromo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public ProdutoDTO getDTO() {
		// TODO Auto-generated method stub
		return new ProdutoDTO(getId(), getNome(), getValor(), isPromocao(),getValorPromo(), getImagem());
	}
	 
}
