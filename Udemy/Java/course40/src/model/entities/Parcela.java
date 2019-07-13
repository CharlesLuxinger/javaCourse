package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date data;
	private Double valor;
	
	public Parcela(Date data, Double valor) {
		this.data = data;
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return sdf.format(data) + " - " + String.format("%.2f", valor);
 	}
}
