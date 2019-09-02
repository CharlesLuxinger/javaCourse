package br.com.charles.designpattern.state;

import br.com.charles.designpattern.chainofresponsibility.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
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
		orcamento.setEstadoAtual(new Finalizado());
	}
}
