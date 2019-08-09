package br.com.alura;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteMaps {
	public static void main(String[] args) {
		Aula aula1 = new Aula("Teste 1", 15);
		Aula aula2 = new Aula("Teste 2", 21);
		Aula aula3 = new Aula("Teste 2", 21);

		Curso curso = new Curso("Padeiro", "Manuel", Arrays.asList(aula1, aula2));

		Map<Curso, List<Aula>> curso2 = new HashMap<Curso, List<Aula>>();

		curso2.put(new Curso("Padeiro", "Manuel"), Arrays.asList(aula1, aula2));
	}
}
