package br.com.charles.designpattern.interpreter;

public class Subtracao implements Expressao {
	private Expressao esquerda;
	private Expressao direta;

	Subtracao(Expressao esquerda, Expressao direta) {
		this.esquerda = esquerda;
		this.direta = direta;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() - direta.avalia();
	}
}
