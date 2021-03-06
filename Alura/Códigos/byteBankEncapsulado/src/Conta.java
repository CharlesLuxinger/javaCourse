

public class Conta {
	private double saldo;
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

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(Conta contaRecebedor, double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaRecebedor.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero( ) {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if(novoNumero < 0) { 
		System.out.println("Conta Inv�lida");
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
		System.out.println("Ag�ncia Inv�lida");
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
}
