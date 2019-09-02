package br.com.charles.designpattern.visitor;

import br.com.charles.designpattern.interpreter.Numero;
import br.com.charles.designpattern.interpreter.Soma;
import br.com.charles.designpattern.interpreter.Subtracao;

public class Visitor {
	public void imprimiSoma(Soma soma) {
		System.out.print(" (");
		soma.getEsquerda().acceptVisitor(this);
		System.out.print(" + ");
		soma.getDireita().acceptVisitor(this);
		System.out.print(") ");
	}

	public void imprimiSubtracao(Subtracao subtracao) {
		System.out.print(" (");
		subtracao.getEsquerda().acceptVisitor(this);
		System.out.print(" - ");
		subtracao.getDireita().acceptVisitor(this);
		System.out.print(") ");
	}

	public void imprimiNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}
}
