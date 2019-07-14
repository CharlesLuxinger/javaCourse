package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "mariajoana@email.com");
		Client c2 = new Client("Maria", "mariajoana@email.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		//Compara o contéudo
		System.out.println(c1.equals(c2));
		//Compara a referência
		System.out.println(c1 == c2);
	}

}
