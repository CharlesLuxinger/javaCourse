package br.com.charles.designpattern.interpreter;

public class TesteInterpreter {
	public static void main(String[] args) {
		Expressao expEsquerda = new Subtracao(new Numero(10), new Numero(20));
		Expressao expDireita = new Soma(new Numero(1), new Numero(2));
		Expressao soma = new Soma(expEsquerda, expDireita);

		int resultado = soma.avalia();

		System.out.println(resultado);
	}
}
