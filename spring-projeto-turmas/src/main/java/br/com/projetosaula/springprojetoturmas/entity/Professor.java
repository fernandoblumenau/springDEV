package br.com.projetosaula.springprojetoturmas.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Professor extends Pessoa{

	public Professor() {}
	
	@OneToOne
	@JoinColumn(name="turma_id")
	private Turma turmas;

	public Turma getTurmas() {
		return turmas;
	}

	public void setTurmas(Turma turmas) {
		this.turmas = turmas;
	}
	


	
	
	

}
