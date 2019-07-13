package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcela;

public class Parcelas {
	
	private ServicoPagamento servicoPagamento;
	
	public Parcelas (ServicoPagamento servicoPagamento) {
		this.servicoPagamento = servicoPagamento;
	}
	
	public void processaContrato (Contrato contrato, int numeroParcelas) {
		double quotaInicial = contrato.getValor() / (double)numeroParcelas;
		
		for (int i = 1; i <= numeroParcelas; i++) {
			Date data = addMonths(contrato.getData(), i);
			double quotaAtualizada = quotaInicial + servicoPagamento.parcela(quotaInicial, i);
			double quotaFinal = quotaAtualizada + servicoPagamento.taxaPagamento(quotaAtualizada);
			contrato.addParcelas(new Parcela(data, quotaFinal));
		}
	}
	
	private Date addMonths(Date data, int n) {
		Calendar cal  = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
