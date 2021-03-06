package applicantion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
			/*Classes abstratas
				� S�o classes que n�o podem ser instanciadas
				� � uma forma de garantir heran�a total: somente subclasses n�o
				abstratas podem ser instanciadas, mas nunca a superclasse abstrata
				
			  Nota��o UML: Classe em It�lico
			*/
		
		//Account acc1 = new Account(1001, "Alex", 1000.0);  N�o pode ser instanciadas
		Account acc2 = new SavingAccount(1002, "Manuel", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Jo�o", 1000.0, 500.0);
		
		Account acc4 = new SavingAccount(1004, "Felipe", 100.0, 0.02);
		Account acc5 = new BusinessAccount(1005, "Carla", 5000.0, 400.0);
		
		
		List <Account> list = new ArrayList<Account>();
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
		list.add(acc5);
		
		double sum = 0;
		for(Account acc : list) {
			sum+= acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		for(Account acc : list) {
			acc.deposit(10);
			System.out.printf(acc.getHolder() + " Balance: %.2f%n", acc.getBalance());
		}
		
		System.out.println("\nUpdate Balance");
		sum = 0;
		for(Account acc : list) {
			sum+= acc.getBalance();
		}
		System.out.printf("Total Balance: %.2f%n", sum);
	}

}
