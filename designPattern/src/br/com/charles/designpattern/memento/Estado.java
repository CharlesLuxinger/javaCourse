package br.com.charles.designpattern.memento;

public class Estado {
	private Contrato contrato;

	public Estado(Contrato contrato) {
		this.contrato = contrato;
	}

	public Contrato getContrato() {
		return contrato;
	}
}
