package br.com.charles.designpattern.strategy;

public class CalculadorDeImposto {
	public void realizaCalculoImposto(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcula(orcamento));
	}
}
