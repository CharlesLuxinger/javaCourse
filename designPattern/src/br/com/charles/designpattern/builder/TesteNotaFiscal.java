package br.com.charles.designpattern.builder;

public class TesteNotaFiscal {
	public static void main(String[] args) {
		NotaFiscalBuilder nfBuilder = new NotaFiscalBuilder();

		nfBuilder.setRazaoSocial("Teste NF").setCnpj("0224024").setItem(new ItemDaNota("item 1", 200.0))
				.setItem(new ItemDaNota("item 1", 300.0)).setItem(new ItemDaNota("item 3", 400.0))
				.setObservacoes("Apenas um teste");

		NotaFiscal nf = nfBuilder.build();

		System.out.println(nf.getValorBruto());

//		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200.0), new ItemDaNota("item 2", 400.0));
//
//		double valorTotal = 0;
//
//		for (ItemDaNota item : itens) {
//			valorTotal += item.getValor();
//		}
//
//		double impostos = valorTotal + 0.05;
//
//		NotaFiscal nd = new NotaFiscal("Teste NF", "0224024", Calendar.getInstance(), valorTotal, impostos, itens,
//				"Apenas um teste");
	}
}
