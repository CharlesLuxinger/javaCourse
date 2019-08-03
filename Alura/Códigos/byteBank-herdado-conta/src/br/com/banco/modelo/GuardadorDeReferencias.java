package br.com.banco.modelo;

public class GuardadorDeReferencias {
	private int posicaolivre = 0;
	private Object[] referencias;

	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
	}

	public void adiciona(Object ref) {
		this.referencias[this.posicaolivre] = ref;
		this.posicaolivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaolivre;
	}

	public Object getReferencias(int pos) {
		return this.referencias[pos];
	}
}
