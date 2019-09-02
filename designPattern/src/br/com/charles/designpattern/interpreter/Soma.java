package br.com.charles.designpattern.interpreter;

public class Soma implements Expressao {
	private Expressao esquerda;
	private Expressao direta;

	Soma(Expressao esquerda, Expressao direta) {
		this.esquerda = esquerda;
		this.direta = direta;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() + direta.avalia();
	}
}
