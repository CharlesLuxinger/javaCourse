package br.com.charles.designpattern.strategy;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public abstract class Imposto {
	protected Imposto outroImposto;

	public Imposto() {

	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double calcula(Orcamento orcamento);

	protected double calculaProximoImposto(Orcamento orcamento) {
		return (outroImposto == null ? 0 : outroImposto.calcula(orcamento));
	}
}
