package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies  = new TreeMap<String, String>();
		
		cookies.put("username", "charles123");
		cookies.put("email", "charles@email.com");
		cookies.put("city", "Vitória");
		cookies.put("state", "ES");
		
		cookies.remove("email");
		
		cookies.put("city", "Serra");
		
		System.out.println("All Cookies: ");
		
		System.out.println("Contains 'username' key: " + cookies.containsKey("username"));
		
		System.out.println("City: " + cookies.get("city"));
		
		System.out.println("Email: " + cookies.get("email"));
		
		System.out.println("Size: " + cookies.size());
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		Map<Product, Double> stock = new HashMap<Product, Double>();
		
		Product p1 = new Product("TV", 900.0);
		Product p2 = new Product("Celular", 1000.0);
		Product p3 = new Product("Table", 400.0);
		
		stock.put(p1, 10000.00);
		stock.put(p2, 20000.00);
		stock.put(p3, 30000.00);
		
		Product ps = new Product("TV", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
	}

}
