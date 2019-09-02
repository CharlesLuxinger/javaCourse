package br.com.charles.designpattern.observer;

import br.com.charles.designpattern.builder.NotaFiscal;

public interface AcaoAposGerarNota {
	void executa(NotaFiscal notaFiscal);
}
