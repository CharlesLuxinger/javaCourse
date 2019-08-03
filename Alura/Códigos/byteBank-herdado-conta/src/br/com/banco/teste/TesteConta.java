package br.com.banco.teste;

import br.com.banco.modelo.*;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(cp, 50.00);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cc.saca(10);
		System.out.println(cc.getSaldo());

	}

}
