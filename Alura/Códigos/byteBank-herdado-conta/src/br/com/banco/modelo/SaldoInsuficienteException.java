package br.com.banco.modelo;
public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException (String msg) {
		super(msg);
	}

}
