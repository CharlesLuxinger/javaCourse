package applicantion;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		/*@Override
			� � a implementa��o de um m�todo de uma superclasse na subclasse
		*/
		
		Account acc1 = new Account(1001, "Charles Luxinger", 1000.0);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acs1 = new SavingAccount(1002, "Maria Joaquina", 1000.0, 0.1);
		acs1.withDraw(200.0);
		System.out.println(acs1.getBalance());
		
		Account acb1 = new BusinessAccount(1003, "Marta Suzano", 1000.0, 500.0);
		acb1.withDraw(200.0);
		System.out.println(acb1.getBalance());
	}

}
