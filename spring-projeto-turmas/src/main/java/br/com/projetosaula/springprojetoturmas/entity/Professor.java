package br.com.projetosaula.springprojetoturmas.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Professor {

	public Professor() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name="turma_id")
	private Turma turmas;
	
	
	@OneToOne
	@JoinColumn(name ="pessoa_id")
	private Pessoa pessoa;


	public Turma getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma turmas) {
		this.turmas = turmas;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
