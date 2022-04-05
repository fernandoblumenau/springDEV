package br.com.projetosaula.springprojetoturmas.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Professor extends Pessoa{

	public Professor() {}
	
	private List<Turma> turmas;
	

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
	

}
