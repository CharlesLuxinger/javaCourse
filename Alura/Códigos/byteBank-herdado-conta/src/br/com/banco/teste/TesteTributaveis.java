package br.com.banco.teste;

import br.com.banco.modelo.*;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(22, 33);
		cc.deposita(100);
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
