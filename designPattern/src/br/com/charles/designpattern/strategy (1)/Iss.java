package br.com.charles.designpattern.strategy;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public class Iss extends Imposto {

	public Iss() {

	}

	public Iss(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaProximoImposto(orcamento);
	}

}
