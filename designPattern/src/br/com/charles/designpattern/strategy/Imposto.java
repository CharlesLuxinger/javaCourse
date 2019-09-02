package br.com.charles.designpattern.strategy;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public interface Imposto {
	double calcula(Orcamento orcamento);
}
