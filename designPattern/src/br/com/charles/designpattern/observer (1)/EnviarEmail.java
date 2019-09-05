package br.com.charles.designpattern.observer;

import br.com.charles.designpattern.builder.NotaFiscal;

public class EnviarEmail implements AcaoAposGerarNota {
	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Email enviado!");
	}
}
