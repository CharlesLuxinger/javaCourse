package br.com.charles.designpattern.strategy;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public class Icms extends Imposto {

	public Icms() {

	}

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaProximoImposto(orcamento);
	}

}
