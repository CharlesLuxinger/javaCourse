package br.com.charles.designpattern.templatemethod;

import br.com.charles.designpattern.chainofresponsibility.Item;
import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public class IKCV extends TemplateImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQueCemReias(orcamento);
	}

	private boolean temItemMaiorQueCemReias(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

}
