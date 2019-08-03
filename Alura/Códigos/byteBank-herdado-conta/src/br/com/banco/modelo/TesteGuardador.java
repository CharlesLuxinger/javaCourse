package br.com.banco.modelo;

import br.com.banco.modelo.Conta;
import br.com.banco.modelo.GuardadorDeContas;

public class TesteGuardador {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(33, 44);
		
		guardador.adiciona(cc2);
		
		System.out.println(guardador.getQuantidadeDeElementos());
		
		Conta ref = (Conta) guardador.getContas(1);
		
		System.out.println(ref.getNumero());
	}

}
