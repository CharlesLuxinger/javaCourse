package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		/*
		 * � Upcasting � Casting da subclasse para superclasse � Uso comum: polimorfismo
		 * 
		 * � Downcasting � Casting da superclasse para subclasse � Palavra instanceof �
		 * Uso comum: m�todos que recebem par�metros gen�ricos (ex: Equals)
		 */

		Account acc = new Account(1001, "Charles Luxinger", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria Joaquina", 0.0, 500.0);

		// Upcasting;

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Jo�o Manuel", 0.0, 600.0);
		Account acc3 = new SavingAccount(1004, "Ana Maria", 0.0, 0.01);

		// Downcasting

		BusinessAccount bacc1 = (BusinessAccount) acc2;
		bacc1.loan(100.0);

		// O COMPILADOR NA SABE O TIPO DE ACC3, ENT�O N�O APRESENTA ERRO DE SINTAXES.
		// APRESENTARA ERRO SOMENTE EM TEMPO DE EXECU��O;
		// BusinessAccount bacc2 = (BusinessAccount)acc3;
		// CORRIGIR ERRO ANTERIOR
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount) acc3;
			bacc2.loan(100.0);
			System.out.println("Loan ok!");
		} else if (acc3 instanceof SavingAccount) {
			SavingAccount bacc2 = (SavingAccount) acc3;
			bacc2.updateBalance();
			System.out.println("Update Balance ok!");
		}
	}

}
