package br.com.charles.designpattern.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao = Calendar.getInstance();
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens = new ArrayList<ItemDaNota>();
	private String observacoes;

	public NotaFiscalBuilder setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder setItem(ItemDaNota item) {
		itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder setObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscal build() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}
}
