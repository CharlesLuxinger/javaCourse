package br.com.banco.teste.util;

import java.util.ArrayList;

import br.com.banco.modelo.Conta;
import br.com.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(33, 44);
		
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 11);
		
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 44);
		
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		for(Object cRef : lista) {
			System.out.println(cRef);
//			for(int i = 0; i < lista.size(); i++) {
//			Object cRef = lista.get(i);
//			System.out.println(cRef);
//		}
		}
				
	}

}
