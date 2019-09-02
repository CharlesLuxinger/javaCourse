package br.com.charles.designpattern.interpreter;

import br.com.charles.designpattern.visitor.Visitor;

public class Numero implements Expressao {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	public int getNumero() {
		return this.numero;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.imprimiNumero(this);
	}

}
