package br.com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Testeasda3");
		palavras.add("Testeasd2");
		palavras.add("Testeasddddsa1");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(t -> System.out.println(t));
		palavras.forEach(System.out::println);

	}
}