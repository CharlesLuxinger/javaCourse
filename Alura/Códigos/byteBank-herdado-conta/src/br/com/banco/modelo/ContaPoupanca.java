package br.com.banco.modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public String toString() {
		return "Conta Poupan�a: " + super.getNumero() + " Ag�ncia: " + super.getAgencia();
	}
}
