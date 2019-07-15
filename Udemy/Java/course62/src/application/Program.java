package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 95.0));
		
		// Interface Function(Uma lista de produtos para uma lista de Strings)
		List<String> names1 = list.stream().map(new UpperName()).collect(Collectors.toList());
		
		

		// Referência ao um metódo estático
		List<String> names2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		
		

		// Referência ao um metódo não estático
		List<String> names3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		

		// Função Lambda declarada
		Function<Product, String> func = x -> x.getName().toUpperCase();
		List<String> names4 = list.stream().map(func).collect(Collectors.toList());
		
		
		

		// Função lambda inline
		List<String> names5 = list.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());

		
		
		names1.forEach(System.out::println);
		names2.forEach(System.out::println);
		names3.forEach(System.out::println);
		names4.forEach(System.out::println);
		names5.forEach(System.out::println);
	}

}
