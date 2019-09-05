package br.com.argentum.model;

import java.time.LocalDateTime;

public final class Candlestick {

	private final double abertura;
	private final double fechamento;
	private final double maximo;
	private final double minimo;
	private final double volume;
	private final LocalDateTime dataHora;

	public Candlestick(double abertura, double fechamento, double maximo, double minimo, double volume,
			LocalDateTime dataHora) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.maximo = maximo;
		this.minimo = minimo;
		this.volume = volume;
		this.dataHora = dataHora;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getVolume() {
		return volume;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public boolean isAlta() {
		return this.fechamento > this.abertura;
	}

}
