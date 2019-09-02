package br.com.charles.designpattern.memento;

import java.util.Calendar;

public class Contrato {
	private Calendar data;
	private String cliente;
	private TipoContrato status;

	public Contrato(Calendar data, String cliente, TipoContrato status) {
		this.data = data;
		this.cliente = cliente;
		this.status = status;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getStatus() {
		return status;
	}

	public void nextStatus() {
		switch (status) {
		case NOVO:
			status = TipoContrato.EM_ANDAMENTO;
			break;
		case EM_ANDAMENTO:
			status = TipoContrato.ACERTADO;
			break;
		case ACERTADO:
			status = TipoContrato.CONCLUIDO;
			break;
		}
	}

	public Estado salvaEstado() {
		return new Estado(new Contrato(this.data, this.cliente, this.status));
	}
}
