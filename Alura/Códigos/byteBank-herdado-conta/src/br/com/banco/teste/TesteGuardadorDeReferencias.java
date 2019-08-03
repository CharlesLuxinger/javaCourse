package br.com.banco.teste;

import br.com.banco.modelo.Conta;
import br.com.banco.modelo.ContaCorrente;
import br.com.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeReferencias {
	
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(213, 321);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(113, 221);
		guardador.adiciona(cc2);
		
		System.out.println(guardador.getQuantidadeDeElementos());
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
