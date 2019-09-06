package br.com.argentum.indicadores;

import br.com.argentum.model.SerieTemporal;

public class IndicadorFechamento implements Indicador {

	@Override
	public double calcula(int index, SerieTemporal serie) {
		return serie.getCandlesticksById(index).getFechamento();
	}

	@Override
	public String toString() {
		return "Fechamento";
	}

}
