package br.com.charles.designpattern.chainofresponsibility;

public class TestDesconto {
	public static void main(String[] args) {
		CalculadoraDesconto descontos = new CalculadoraDesconto();

		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Lapis", 250.0));
		orcamento.adicionaItem(new Item("Papel", 250.0));
		orcamento.adicionaItem(new Item("Borracha", 250.0));
		orcamento.adicionaItem(new Item("Caderno", 250.0));
		orcamento.adicionaItem(new Item("Livro", 250.0));

		System.out.println(descontos.calcula(orcamento));
	}
}
