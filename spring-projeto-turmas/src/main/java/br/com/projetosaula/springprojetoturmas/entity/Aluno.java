package br.com.projetosaula.springprojetoturmas.entity;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aluno extends Pessoa {
	
	private int ano;
	
	@OneToOne
	@JoinColumn(name="turma_id")
	private Turma turma;

	
	public Aluno() {}



	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
}
