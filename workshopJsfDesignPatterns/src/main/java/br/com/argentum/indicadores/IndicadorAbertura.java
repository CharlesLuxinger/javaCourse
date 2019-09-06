package br.com.argentum.indicadores;

import br.com.argentum.model.SerieTemporal;

public class IndicadorAbertura implements Indicador {

	@Override
	public double calcula(int index, SerieTemporal serie) {
		return serie.getCandlesticksById(index).getAbertura();
	}

	@Override
	public String toString() {
		return "Abertura";
	}

}
