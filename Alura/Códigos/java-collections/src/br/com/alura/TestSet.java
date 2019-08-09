package br.com.alura;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();

		alunos.add("Teste1");
		alunos.add("Teste2");
		alunos.add("Teste3");
		alunos.add("Teste3");

		// Não permite duplicação
		alunos.forEach(x -> System.out.println(x));

		Aula aula1 = new Aula("Teste 1", 15);
		Aula aula2 = new Aula("Teste 2", 21);
		Aula aula3 = new Aula("Teste 2", 21);

		Set<Aula> aulas = new HashSet<Aula>(Arrays.asList(aula1, aula2, aula3));

		System.out.println(aulas.contains(aula2));
		System.out.println(aula2.equals(aula3));

		//Forma antiga de percorrer um Set
		Iterator<Aula> iterator = aulas.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Guarda a ordem de inserção
		Set<Aula> aulas2 = new LinkedHashSet<Aula>(Arrays.asList(aula1, aula2, aula3));

		// Não Guarda a ordem de inserção e Necessita que a classe tenha implementado o
		// Comparable
		Set<Aula> aulas3 = new TreeSet<Aula>(Arrays.asList(aula1, aula2, aula3));
	}
}
