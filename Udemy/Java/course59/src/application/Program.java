package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Celular", 1000.0));
		list.add(new Product("Table", 400.0));

		// Utilizando Classe que implementa Comparator
		list.sort(new MyComparator());

		for (Product p : list) {
			System.out.println(p);
		}

		// Utilizando Classe Anonima
		Comparator<Product> comp1 = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};

		list.sort(comp1);

		for (Product p : list) {
			System.out.println(p);
		}

		// Utilizando Função Anonima(Arrow Function) Lambda
		Comparator<Product> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp2);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
