package br.com.charles.designpattern.interpreter;

import br.com.charles.designpattern.visitor.Visitor;

public class Subtracao implements Expressao {
	private Expressao esquerda;
	private Expressao direta;

	public Subtracao(Expressao esquerda, Expressao direta) {
		this.esquerda = esquerda;
		this.direta = direta;
	}

	@Override
	public int avalia() {
		return esquerda.avalia() - direta.avalia();
	}

	public Expressao getEsquerda() {
		return this.esquerda;
	}

	public Expressao getDireita() {
		return this.direta;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.imprimiSubtracao(this);
	}
}
