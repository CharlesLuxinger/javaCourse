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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantidade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Negociacao other = (Negociacao) obj;
		if (dataHora == null) {
			if (other.dataHora != null) {
				return false;
			}
		} else if (!dataHora.equals(other.dataHora)) {
			return false;
		}
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco)) {
			return false;
		}
		if (quantidade != other.quantidade) {
			return false;
		}
		return true;
	}

	public boolean dateIsEqual(LocalDateTime date) {

		return this.dataHora.getDayOfMonth() == date.getDayOfMonth() 
				&& this.dataHora.getMonth() == date.getMonth()
				&& this.dataHora.getYear() == date.getYear();
	}
}
