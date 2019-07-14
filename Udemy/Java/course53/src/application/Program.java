package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set  = new HashSet<Product>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Celular", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Celular", 1200.0);
		
		//Se a Classe não possuir a implementação equals ou hashcode, e comparado a referencia.
		System.out.println(set.contains(prod));
			
	}

}
