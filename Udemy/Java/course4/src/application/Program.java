package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

public class Program {

	public static void main(String[] args) {
		double radius;
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = sc.nextDouble();

		System.out.println("The Circuference is: " + String.format("%.2f", Calculator.circuference(radius)));

		System.out.println("The Volume is: " + String.format("%.2f", Calculator.volume(radius)));

		sc.close();

	}

}
