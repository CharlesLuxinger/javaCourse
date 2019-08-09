package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();

		alunos.add("Teste1");
		alunos.add("Teste2");
		alunos.add("Teste3");
		alunos.add("Teste3");

		//Não permite duplicação
		alunos.forEach(x -> System.out.println(x));
	}
}
