package br.com.argentum.model;

import java.time.LocalDateTime;

public final class Negociacao {

	private final double preco;
	private final int quantidade;
	private final LocalDateTime dataHora;

	public Negociacao(double preco, int quantidade, LocalDateTime dataHora) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço não poder ser negativo.");
		}
		if (quantidade <= 0) {
			throw new IllegalArgumentException("Quantidade não poder ser menor ou igual a zero.");
		}
		if (dataHora == null) {
			throw new IllegalArgumentException("A data deve ser informada.");
		}
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
