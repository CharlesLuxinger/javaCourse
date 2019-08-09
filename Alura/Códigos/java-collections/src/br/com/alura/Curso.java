package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;

	private List<Aula> aulas = new ArrayList<Aula>();

	public Curso(String nome, String instrutor, List<Aula> aulas) {
		this.nome = nome;
		this.instrutor = instrutor;
		this.aulas = aulas;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adicionaAula(Aula aula) {
		if (aula != null) {
			aulas.add(aula);
		}
	}

}