package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
	public static void main(String[] args) {
		int n;
		double sum = 0.0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter with number of products: ");
		n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Name " + (i + 1) + ": ");
			String name = sc.nextLine();
			System.out.print("Price " + (i + 1) + ": ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;
		System.out.println("Average Price: " + avg);

		sc.close();
	}
}