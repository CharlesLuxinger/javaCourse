package br.com.charles.designpattern.interpreter;

import br.com.charles.designpattern.visitor.Visitor;;

public class Soma implements Expressao {
	private Expressao esquerda;
	private Expressao direta;

	public Soma(Expressao esquerda, Expressao direta) {
		this.esquerda = esquerda;
		this.direta = direta;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() + direta.avalia();
	}

	public Expressao getEsquerda() {
		return this.esquerda;
	}

	public Expressao getDireita() {
		return this.direta;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.imprimiSoma(this);
	}
}
