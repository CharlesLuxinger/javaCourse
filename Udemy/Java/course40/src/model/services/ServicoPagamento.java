package model.services;

public interface ServicoPagamento {
	double taxaPagamento (double quotaAtualizada);
	double parcela (double quotaInicial, int numeroParcela);
}
