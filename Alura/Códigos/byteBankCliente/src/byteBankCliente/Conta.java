package byteBankCliente;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;

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
}
