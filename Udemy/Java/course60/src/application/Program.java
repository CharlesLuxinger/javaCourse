package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 95.0));

		// Interface funcional Predicate
		list.removeIf(new ProductPredicate());
		
		

		// Referência ao um metódo estático
		list.removeIf(Product::staticProductPredicate);
		
		
		

		// Referência ao um metódo não estático
		list.removeIf(Product::nonStaticProductPredicate);
		
		
		
		
		//Função Lambda declarada
		Predicate<Product>pred = x -> x.getPrice() >= 100;
		list.removeIf(pred);
		
		
		
		
		// Função lambda inline
		list.removeIf(x -> x.getPrice() >= 100);
		
		
		

		for (Product product : list) {

			System.out.println(product);

		}

	}
}
