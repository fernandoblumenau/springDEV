package br.com.projeto.ecommerce.data.dto;

import java.io.Serializable;

import br.com.projeto.ecommerce.data.entity.Cadastro;


public class CadastroDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idCadastro;
	private String nomeCadastro;
	private String telefoneCadastro;
	private String cepCadastro;
	private String ruaCadastro;
	private Integer numeroCadastro;
	private String bairroCadastro;
	private String estadoCadastro;
	private String cidadeCadastro;
	


	public CadastroDTO() {
		super();
	}


	public CadastroDTO(Integer idCadastro, String nomeCadastro, String telefoneCadastro, String cepCadastro,
			String ruaCadastro, Integer numeroCadastro, String bairroCadastro, String estadoCadastro,
			String cidadeCadastro) {
		super();
		this.idCadastro = idCadastro;
		this.nomeCadastro = nomeCadastro;
		this.telefoneCadastro = telefoneCadastro;
		this.cepCadastro = cepCadastro;
		this.ruaCadastro = ruaCadastro;
		this.numeroCadastro = numeroCadastro;
		this.bairroCadastro = bairroCadastro;
		this.estadoCadastro = estadoCadastro;
		this.cidadeCadastro = cidadeCadastro;
	}


	public Integer getIdCadastro() {
		return idCadastro;
	}


	public void setIdCadastro(Integer idCadastro) {
		this.idCadastro = idCadastro;
	}


	public String getNomeCadastro() {
		return nomeCadastro;
	}


	public void setNomeCadastro(String nomeCadastro) {
		this.nomeCadastro = nomeCadastro;
	}


	public String getTelefoneCadastro() {
		return telefoneCadastro;
	}


	public void setTelefoneCadastro(String telefoneCadastro) {
		this.telefoneCadastro = telefoneCadastro;
	}


	public String getCepCadastro() {
		return cepCadastro;
	}


	public void setCepCadastro(String cepCadastro) {
		this.cepCadastro = cepCadastro;
	}


	public String getRuaCadastro() {
		return ruaCadastro;
	}


	public void setRuaCadastro(String ruaCadastro) {
		this.ruaCadastro = ruaCadastro;
	}


	public Integer getNumeroCadastro() {
		return numeroCadastro;
	}


	public void setNumeroCadastro(Integer numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}


	public String getBairroCadastro() {
		return bairroCadastro;
	}


	public void setBairroCadastro(String bairroCadastro) {
		this.bairroCadastro = bairroCadastro;
	}


	public String getEstadoCadastro() {
		return estadoCadastro;
	}


	public void setEstadoCadastro(String estadoCadastro) {
		this.estadoCadastro = estadoCadastro;
	}


	public String getCidadeCadastro() {
		return cidadeCadastro;
	}


	public void setCidadeCadastro(String cidadeCadastro) {
		this.cidadeCadastro = cidadeCadastro;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Cadastro convertDtoToEntiy() {
	return new Cadastro(	getIdCadastro(),
							getNomeCadastro(),
							getTelefoneCadastro(),
							getCepCadastro(),
							getRuaCadastro(),
							getNumeroCadastro(),
							getBairroCadastro(),
							getEstadoCadastro(),
							getCidadeCadastro());
	
	}
}
