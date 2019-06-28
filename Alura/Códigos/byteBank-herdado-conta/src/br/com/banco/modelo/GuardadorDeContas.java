package br.com.banco.modelo;

import br.com.banco.modelo.Conta;

public class GuardadorDeContas {
	private int posicaolivre = 0;
	private Conta[] referencias;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posicaolivre] = ref;
		this.posicaolivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaolivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

	public Conta getContas(int pos) {
		return this.referencias[pos];
	}
}
