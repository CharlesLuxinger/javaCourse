package br.com.charles.designpattern.memento;

import java.util.Calendar;

public class TesteMemento {
	public static void main(String[] args) {
		HistoricoContrato historicoContrato = new HistoricoContrato();
		Contrato contrato = new Contrato(Calendar.getInstance(), "Teste 1", TipoContrato.NOVO);

		historicoContrato.addEstado(contrato.salvaEstado());

		contrato.nextStatus();
		historicoContrato.addEstado(contrato.salvaEstado());

		System.out.println(historicoContrato.getEstado(0).getContrato().getStatus());
		System.out.println(historicoContrato.getEstado(1).getContrato().getStatus());
	}
}
