package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Ente account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		try {
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		acc.withdraw(amount);
		}
		catch (DomainException de) {
			System.out.println("Withdraw Error: " + de.getMessage());
		}
		catch (RuntimeException re) {
			System.out.println("Unexpected Erro!!!");
		}
		
		System.out.println("End of Operations!");
		sc.close();

	}

}
