package br.com.charles.designpattern.facadessingleton;

public class TesteFacadeSingleton {
	public static void main(String[] args) {
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();

		facade.buscaCliente(cpf);
		facade.criaFatura(cliente, valor);
		facade.fazContato(cliente, cobranca);
		facade.geraCobranca(fatura);

	}
}
