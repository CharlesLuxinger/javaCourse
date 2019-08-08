package br.com.alura.main;


public class ContaCorrente extends Conta implements Tributavel {

	private static final long serialVersionUID = 1L;

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
