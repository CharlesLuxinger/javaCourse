package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 95.0));

		// Interface Consumer
		list.forEach(new PriceUpdate());
		
		

		// Refer�ncia ao um met�do est�tico
		list.forEach(Product::staticPriceUpdate);
		
		

		// Refer�ncia ao um met�do n�o est�tico
		list.forEach(Product::nonStaticPriceUpdate);
		
		

		// Fun��o Lambda declarada
		Consumer<Product> cons = x -> x.setPrice(x.getPrice() *1.1);
		list.forEach(cons);
		
		

		// Fun��o lambda inline
		list.forEach(x -> x.setPrice(x.getPrice() *1.1));

		
		
		list.forEach(System.out::println);
	}

}
