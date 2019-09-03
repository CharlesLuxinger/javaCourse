package br.com.charles.designpattern.command;

public class TesteCommand {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Teste 1", 100.0);
		Pedido pedido2 = new Pedido("Teste 2", 100.0);
		Pedido pedido3 = new Pedido("Teste 3", 100.0);

		FilaDeTrabalho filaDeTrabalho = new FilaDeTrabalho();

		filaDeTrabalho.adiciona(new PagaPedido(pedido1));
		filaDeTrabalho.adiciona(new PagaPedido(pedido2));
		filaDeTrabalho.adiciona(new PagaPedido(pedido3));

		filaDeTrabalho.adiciona(new ConcluiPedido(pedido1));
		filaDeTrabalho.adiciona(new ConcluiPedido(pedido2));
		filaDeTrabalho.adiciona(new ConcluiPedido(pedido3));

		filaDeTrabalho.processa();
	}

}
