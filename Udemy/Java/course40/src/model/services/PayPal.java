package model.services;

public class PayPal implements ServicoPagamento{
	private static final double JUROS_POR_MES = 0.01;  
	private static final double TAXA_POR_PAGAMENTO = 0.02;
	
	@Override
	public double taxaPagamento(double quotaAtualizada) {
		return quotaAtualizada * TAXA_POR_PAGAMENTO;
	}
	
	@Override
	public double parcela (double quotaInicial, int numeroParcela) {
		return quotaInicial * JUROS_POR_MES * numeroParcela;
	}
}
