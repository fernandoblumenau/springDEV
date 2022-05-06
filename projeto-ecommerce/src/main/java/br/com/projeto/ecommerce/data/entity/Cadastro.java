package br.com.projeto.ecommerce.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.projeto.ecommerce.data.dto.CadastroDTO;
import br.com.projeto.ecommerce.data.dto.ProdutoDTO;

@Entity
public class Cadastro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String telefone;
	private String CEP;
	private String rua;
	private Integer numero;
	private String bairro;
	private String estado;
	
	public Cadastro() {
		super();
	}

	public Cadastro(Integer id, String telefone, String cEP, String rua, Integer numero, String bairro, String estado) {
		super();
		this.id = id;
		this.telefone = telefone;
		CEP = cEP;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public CadastroDTO getDTO() {
		// TODO Auto-generated method stub
		return new CadastroDTO(getId(), getTelefone(), getCEP(), getRua(),getNumero(), getBairro(),getEstado());
	
	}
	

}
