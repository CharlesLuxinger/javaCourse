package br.com.charles.designpattern.state;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);

	void reprova(Orcamento orcamento);

	void finaliza(Orcamento orcamento);
}
