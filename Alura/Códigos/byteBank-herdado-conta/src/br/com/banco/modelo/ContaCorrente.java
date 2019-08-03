package br.com.banco.modelo;

import br.com.banco.teste.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);

	}
	
	
	@Override
	public void saca(double valor) {
		super.saca(valor + 0.1);
	}


	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.getNumero() + " Agência: " + super.getAgencia();
	}

}
