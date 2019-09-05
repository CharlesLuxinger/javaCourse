package br.com.argentum.model;

import java.time.LocalDateTime;

public class CandlestickBuilder {
	private double abertura;
	private double fechamento;
	private double maximo;
	private double minimo;
	private double volume;
	private LocalDateTime dataHora;

	public Candlestick build() {
		return new Candlestick(abertura, fechamento, maximo, minimo, volume, dataHora);
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

	public CandlestickBuilder setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
		return this;
	}
}
