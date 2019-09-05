package br.com.argentum.model;

import java.time.LocalDateTime;

public class CandlestickBuilder {
	private double abertura;
	private double fechamento;
	private double maximo;
	private double minimo;
	private double volume;
	private LocalDateTime data;

	public Candlestick build() {
		return new Candlestick(abertura, fechamento, maximo, minimo, volume, data);
	}

	public CandlestickBuilder setAbertura(double abertura) {
		this.abertura = abertura;
		return this;
	}

	public CandlestickBuilder setFechamento(double fechamento) {
		this.fechamento = fechamento;
		return this;
	}

	public CandlestickBuilder setMaximo(double maximo) {
		this.maximo = maximo;
		return this;
	}

	public CandlestickBuilder setMinimo(double minimo) {
		this.minimo = minimo;
		return this;
	}

	public CandlestickBuilder setVolume(double volume) {
		this.volume = volume;
		return this;
	}

	public CandlestickBuilder setData(LocalDateTime data) {
		this.data = data;
		return this;
	}
}
