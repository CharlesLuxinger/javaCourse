package br.com.charles.designpattern.chainofresponsibility;

public interface Desconto {
	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);
}
