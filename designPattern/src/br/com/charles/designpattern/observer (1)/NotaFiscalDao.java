package br.com.charles.designpattern.observer;

import br.com.charles.designpattern.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvo no DB");
	}
}
