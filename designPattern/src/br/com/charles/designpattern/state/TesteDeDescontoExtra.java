package br.com.charles.designpattern.state;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public class TesteDeDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.aprova();

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.finaliza();

		System.out.println(reforma.getValor());
	}
}
