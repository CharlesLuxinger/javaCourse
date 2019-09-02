package br.com.charles.designpattern.observer;

import br.com.charles.designpattern.builder.ItemDaNota;
import br.com.charles.designpattern.builder.NotaFiscal;
import br.com.charles.designpattern.builder.NotaFiscalBuilder;

public class TesteAcaoes {
	public static void main(String[] args) {
		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder();

		nfBuilder.setRazaoSocial("Teste NF").setCnpj("0224024").setItem(new ItemDaNota("item 1", 200.0))
				.setItem(new ItemDaNota("item 1", 300.0)).setItem(new ItemDaNota("item 3", 400.0))
				.setObservacoes("Apenas um teste");

		nfBuilder.addAcao(new EnviarEmail());
		nfBuilder.addAcao(new Impressora());
		nfBuilder.addAcao(new NotaFiscalDao());

		NotaFiscal nf = nfBuilder.build();

		System.out.println(nf.getValorBruto());
	}
}
