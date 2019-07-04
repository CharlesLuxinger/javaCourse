package applicantion;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
			/*Polimorfismo
			    Recurso que permite que variáveis de um mesmo tipo mais genérico possam
				apontar para objetos de tipos específicos diferentes, tendo assim
				comportamentos diferentes conforme cada tipo específico.
			*/
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingAccount(1021, "Manuel", 1000.0, 0.01);
		
		x.withDraw(50.0);
		y.withDraw(50.0);
	}

}
