package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		//É necessário implementar na Classe o Comparable, para que se possa ordenar.
		Set<Product> set  = new TreeSet<Product>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Celular", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for(Product p : set) {
			System.out.println(p);
		}
			
	}

}
