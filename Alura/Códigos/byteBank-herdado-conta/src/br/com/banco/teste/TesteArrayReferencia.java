package br.com.banco.teste;

import br.com.banco.modelo.Conta;
import br.com.banco.modelo.ContaCorrente;
import br.com.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		Conta[] contasCorrrente = new Conta[5];
		Conta[] contasPoupanca = new Conta[5];
		Object[] referencia = new Object[5];
		
		System.out.println(referencia.length);

		ContaPoupanca cp2 = new ContaPoupanca(321, 654);

		referencia[0] = cp2;

		ContaPoupanca ref = (ContaPoupanca) referencia[0];

		System.out.println(ref.getNumero());

		for (int i = 0; i < contasPoupanca.length; i++) {
			ContaPoupanca cc1 = new ContaPoupanca(i * i, i * i * 3);
			contasPoupanca[i] = cc1;
			System.out.println(
					i + 1 + "º " + "CP:" + contasPoupanca[i].getNumero() + " AG: " + contasPoupanca[i].getAgencia());
		}
		for (int i = 0; i < contasCorrrente.length; i++) {
			ContaCorrente cc1 = new ContaCorrente(i * i, i * i * 2);
			contasCorrrente[i] = cc1;
			System.out.println(
					i + 1 + "º " + "CC:" + contasCorrrente[i].getNumero() + " AG: " + contasCorrrente[i].getAgencia());
		}

	}

}
