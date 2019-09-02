package br.com.charles.designpattern.decorator;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;
import br.com.charles.designpattern.strategy.Icms;
import br.com.charles.designpattern.strategy.Imposto;
import br.com.charles.designpattern.strategy.Iss;

public class TesteImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new Iss(new Icms());

		Orcamento orcamento = new Orcamento(500.0);

		double valor = iss.calcula(orcamento);

		System.out.println(valor);
	}

}
