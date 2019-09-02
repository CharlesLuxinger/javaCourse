package br.com.charles.designpattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.charles.designpattern.state.EmAprovacao;
import br.com.charles.designpattern.state.EstadoDeUmOrcamento;

public class Orcamento {

	private double valor;
	private final List<Item> itens;

	private EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.setValor(valor);
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		getEstadoAtual().aplicaDescontoExtra(this);
	}

	public EstadoDeUmOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
