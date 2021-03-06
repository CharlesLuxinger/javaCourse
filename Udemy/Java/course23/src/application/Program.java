package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		List<Product> list = new ArrayList<Product>();

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, Used ou Imported (c/u/i)? ");
			char tag = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (tag == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			} else if (tag == 'u') {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

				System.out.print("Manufacture Date: ");
				Date manufactureDate = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
			} else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
			}
		}
		
		System.out.println("\n" + "Price Tags:");
		for (Product pr : list) {
			System.out.println(pr.priceTag());
		}
		sc.close();
	}
}
