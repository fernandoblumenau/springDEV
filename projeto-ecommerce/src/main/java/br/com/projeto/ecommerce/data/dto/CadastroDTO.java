package br.com.projeto.ecommerce.data.dto;

import java.io.Serializable;

import br.com.projeto.ecommerce.data.entity.Cadastro;


public class CadastroDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idCadastro;
	private String telefoneCadastro;
	private String CEPCadastro;
	private String ruaCadastro;
	private Integer numeroCadastro;
	private String bairroCadastro;
	private String estadoCadastro;
	
	public CadastroDTO() {
		super();
	}

	public CadastroDTO(Integer idCadastro, String telefoneCadastro, String cEPCadastro, String ruaCadastro,
			Integer numeroCadastro, String bairroCadastro, String estadoCadastro) {
		super();
		this.idCadastro = idCadastro;
		this.telefoneCadastro = telefoneCadastro;
		CEPCadastro = cEPCadastro;
		this.ruaCadastro = ruaCadastro;
		this.numeroCadastro = numeroCadastro;
		this.bairroCadastro = bairroCadastro;
		this.estadoCadastro = estadoCadastro;
	}
	

	public Integer getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(Integer idCadastro) {
		this.idCadastro = idCadastro;
	}

	public String getTelefoneCadastro() {
		return telefoneCadastro;
	}

	public void setTelefoneCadastro(String telefoneCadastro) {
		this.telefoneCadastro = telefoneCadastro;
	}

	public String getCEPCadastro() {
		return CEPCadastro;
	}

	public void setCEPCadastro(String cEPCadastro) {
		CEPCadastro = cEPCadastro;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Cadastro convertDtoToEntiy() {
	return new Cadastro(	getIdCadastro(),
							getTelefoneCadastro(),
							getCEPCadastro(),
							getRuaCadastro(),
							getNumeroCadastro(),
							getBairroCadastro(),
							getEstadoCadastro());
	
	}
}
