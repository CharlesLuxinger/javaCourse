package br.com.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = " Alura ";
		// String nome = new String ("Alura");
		nome.replace('A', 'a');

		System.out.println(nome);

		System.out.println(nome.toUpperCase());

		System.out.println(nome.charAt(2));

		System.out.println(nome.indexOf("lu"));
		
		System.out.println(nome.substring(1));
		
		System.out.println(nome.length());
		
		System.out.println(nome.isEmpty());
		
		System.out.println(nome.trim());
		
		System.out.println(nome.contains("ur")   );
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}
