package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductServices;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 95.0));

		ProductServices ps = new ProductServices();

		// Funcões que recebem funções lamba como argumento.
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

		System.out.println("Sum: " + sum);
	}

}
