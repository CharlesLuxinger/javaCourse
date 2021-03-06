package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Jo�o");
		list.add("Joana");
		list.add("Pedro");
		list.add(2, "Charles");

		System.out.println(list.size());

		list.remove("Maria");

		for (String x : list) {
			System.out.println(x);
		}

		list.remove(3);

		// Remover ocorr�ncias com base em predicado
		list.removeIf(x -> x.charAt(0) == 'M');

		System.out.println(list.indexOf("Charles"));

		// Encontrar ocorr�ncias com base em predicado
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		// Encontrar primeira ocorr�ncia com base em predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}

/*
 * � Tamanho da lista: size() � Obter o elemento de uma posi��o: get(position) �
 * Inserir elemento na lista: add(obj), add(int, obj) � Remover elementos da
 * lista: remove(obj), remove(int), removeIf(Predicate) � Encontrar posi��o de
 * elemento: indexOf(obj), lastIndexOf(obj) � Filtrar lista com base em
 * predicado: List<Integer> result = list.stream().filter(x -> x >
 * 4).collect(Collectors.toList()); � Encontrar primeira ocorr�ncia com base em
 * predicado: Integer result = list.stream().filter(x -> x >
 * 4).findFirst().orElse(null);
 */
