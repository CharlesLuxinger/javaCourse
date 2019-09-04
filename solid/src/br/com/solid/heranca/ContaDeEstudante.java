package br.com.solid.heranca;

public class ContaDeEstudante implements Conta {
	private ManipuladorDeSaldo manipulador;
	private int milhas;

	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	@Override
	public void deposita(double valor) {
		manipulador.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}

	@Override
	public void rende() {

	}

	@Override
	public double getSaldo() {
		return manipulador.getSaldo();
	}
}
