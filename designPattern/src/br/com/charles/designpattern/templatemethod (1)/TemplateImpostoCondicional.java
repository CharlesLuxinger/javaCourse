package br.com.charles.designpattern.templatemethod;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;
import br.com.charles.designpattern.strategy.Imposto;

public abstract class TemplateImpostoCondicional extends Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculaProximoImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculaProximoImposto(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
