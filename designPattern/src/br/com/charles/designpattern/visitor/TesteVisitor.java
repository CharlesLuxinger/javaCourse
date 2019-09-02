package br.com.charles.designpattern.visitor;

import br.com.charles.designpattern.interpreter.Expressao;
import br.com.charles.designpattern.interpreter.Numero;
import br.com.charles.designpattern.interpreter.Soma;
import br.com.charles.designpattern.interpreter.Subtracao;

public class TesteVisitor {
	public static void main(String[] args) {
		Expressao expEsquerda = new Subtracao(new Numero(10), new Numero(20));
		Expressao expDireita = new Soma(new Numero(1), new Numero(2));
		Expressao soma = new Soma(expEsquerda, expDireita);

		int resultado = soma.avalia();

		System.out.println(resultado);

		Visitor impressora = new Visitor();

		soma.acceptVisitor(impressora);
	}
}
