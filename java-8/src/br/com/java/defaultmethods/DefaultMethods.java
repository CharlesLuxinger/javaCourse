package br.com.java.defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethods {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Testeasda3");
		palavras.add("Testeasd2");
		palavras.add("Testeasddddsa1");

		Comparator<String> comparador = new ComparadorPorTamanho();
		palavras.sort(comparador);

		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s2.length() > s1.length()) {
			return 1;
		}
		return 0;
	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}