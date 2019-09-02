package br.com.charles.designpattern.strategy;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public class CalculadorDeImposto {
	public void realizaCalculoImposto(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
}
