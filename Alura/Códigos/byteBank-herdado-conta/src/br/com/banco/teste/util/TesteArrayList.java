package br.com.banco.teste.util;

import java.util.ArrayList;

import br.com.banco.modelo.Conta;
import br.com.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(33, 44);
		
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(33, 44);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Existe: " + existe);
		
		for(Conta cRef : lista) {
			System.out.println(cRef);
		}
				
	}

}
