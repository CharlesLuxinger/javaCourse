package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		/* Exerc�cio Classes e M�todos abstratos */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Person> list = new ArrayList<Person>();

		System.out.print("Enter the numbe of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Indivial or Company(i/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			double anualIcome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				Person ip = new IndividualPerson(name, anualIcome, healthExpenditures);
				list.add(ip);
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				Person ip = new CompanyPerson(name, anualIcome, numberEmployees);
				list.add(ip);
			}
			System.out.println();
		}
		
		double sum = 0;
		System.out.println("\nTaxes Paid:");
		for (Person prs : list) {
			System.out.println(prs.getName() + ": $" + String.format("%.2f", prs.calcImpostos()));
			sum += prs.calcImpostos();
		}
		
		System.out.print("\nTotal Taxes: " + String.format("%.2f", sum));

		sc.close();

	}

}
