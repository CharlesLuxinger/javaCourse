package br.com.argentum.model;

import java.time.LocalDateTime;

public final class Negociacao {

	private final double preco;
	private final int quantidade;
	private final LocalDateTime dataHora;

	public Negociacao(double preco, int quantidade, LocalDateTime dataHora) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.dataHora = dataHora;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public double getVolume() {
		return this.preco * this.quantidade;
	}

}
