package entities;

import java.util.Locale;
import java.util.Scanner;

public class Products {

	private String name;
	private double price;
	private int quantity;

	private double totalValueInStock = price * (double) quantity;

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public void setDataProducts() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name: ");
		System.out.print("Name:");
		this.name = sc.nextLine();

		System.out.print("Price:");
		this.price = sc.nextDouble();

		System.out.print("Quantity:");
		this.quantity = (int) sc.nextInt();
		sc.close();

	}

	public void getDataProducts() {
		System.out.println("Product name: " + this.name);
		System.out.print("Price: " + String.format("%.2f", this.price));
		System.out.print("Quantity: " + this.quantity);
		System.out.println("Total Value in Stock: " + String.format("%.2f", this.totalValueInStock));

	}
}
