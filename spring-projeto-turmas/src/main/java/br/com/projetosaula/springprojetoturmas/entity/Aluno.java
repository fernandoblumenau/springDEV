package br.com.projetosaula.springprojetoturmas.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa {
	
	private int ano;
	@Column(name ="id_turma")
	private Turma turma;
	private List<Disciplina> disciplinas;

	

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

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
