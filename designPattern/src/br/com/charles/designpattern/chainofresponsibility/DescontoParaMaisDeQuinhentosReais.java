package br.com.charles.designpattern.chainofresponsibility;

public class DescontoParaMaisDeQuinhentosReais implements Desconto {
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}

		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
