package br.com.banco.modelo;

/**
 * Estudando JavaDoc 
 * 
 * @author Charles
 * @version 0.0.1
 */


public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	private static int qtdConta;
	
	//Construtor
	public Conta(int numero, int agencia) {
		Conta.qtdConta++;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Insuficiente!");
		}
		this.saldo -= valor;
	}

	public void transfere(Conta contaRecebedor, double valor) {
			this.saca(valor);
			contaRecebedor.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero( ) {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if(novoNumero < 0) { 
		System.out.println("Conta Inválida");
		return;
		}
		else {
		this.numero = novoNumero;
		System.out.println("Cadastro Realizado");
		return;
		}
	}
	
	public int getAgencia( ) {
		return this.agencia;
	}
	
	public void setAgencia(int novoAgencia) {
		if(novoAgencia < 0) { 
		System.out.println("Agência Inválida");
		return;
		}
		else {
		this.agencia = novoAgencia;
		System.out.println("Cadastro Realizado");
		return;
		}
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	public static int getQtdConta() {
		return Conta.qtdConta;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numero;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
}
