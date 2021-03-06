package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.Parcelas;
import model.services.PayPal;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Infome os dados do contrato: ");
		System.out.print("N�mero: ");
		int numero = sc.nextInt();
		System.out.print("Data(DD/MM/YYYY): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.print("Informe o n�mero de parcelas: ");
		int numeroParcelas = sc.nextInt();
		
		Parcelas parcelas = new Parcelas(new PayPal());
		
		parcelas.processaContrato(contrato, numeroParcelas);
		
		System.out.println("Parcelas");
		
		for (Parcela list : contrato.getParcelas()) {
			System.out.println(list);
		}
		
		sc.close();
	}

}
