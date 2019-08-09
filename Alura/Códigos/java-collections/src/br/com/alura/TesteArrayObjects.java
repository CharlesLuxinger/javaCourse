package br.com.alura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TesteArrayObjects {
	public static void main(String[] args) {
		Aula aula1 = new Aula("Teste 1", 15);
		Aula aula2 = new Aula("Teste 2", 21);

		ArrayList<Aula> list = new ArrayList<Aula>(Arrays.asList(aula1, aula2));

		System.out.println(list);

		Collections.sort(list);

		Collections.sort(list, Comparator.comparing(Aula::getTempo));

		list.sort(Comparator.comparing(Aula::getTempo));

		Curso curso = new Curso("Padeiro", "Manuel", Arrays.asList(aula1, aula2));
		
		//curso.getAulas().add(aula1); Não é permitido pelo metodo Collections.unmodifiableList inserido no get
		
		curso.adicionaAula(aula1);
	}
}
