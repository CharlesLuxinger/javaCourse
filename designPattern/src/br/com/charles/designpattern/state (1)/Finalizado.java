package br.com.charles.designpattern.state;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado não se aplica descontos extras.");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Troca de estado inválida.");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Troca de estado inválida.");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Troca de estado inválida.");
	}
}
