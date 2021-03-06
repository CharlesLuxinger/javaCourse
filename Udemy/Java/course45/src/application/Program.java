package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {

		/*
		 * Generics � Generics permitem que classes, interfaces e m�todos possam ser
		 * parametrizados por tipo.
		 */

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<Integer>();

		System.out.print("How many yalues: ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();

		System.out.println("First: " + ps.first());

		sc.close();

	}

}
