package br.com.charles.designpattern.strategy;

public class TestCalcImposto {

	public static void main(String[] args) {
		Imposto icms = new Icms();
		Imposto iss = new Iss();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImposto calculadora = new CalculadorDeImposto();

		calculadora.realizaCalculoImposto(orcamento, icms);
		calculadora.realizaCalculoImposto(orcamento, iss);

	}

}
