package br.com.argentum.indicadores;

import br.com.argentum.model.SerieTemporal;

public class MediaMovelSimples implements Indicador {

	private Indicador indicador = new IndicadorFechamento();

	public MediaMovelSimples() {

	}

	public MediaMovelSimples(Indicador indicador) {
		this.indicador = indicador;

	}

	@Override
	public double calcula(int index, SerieTemporal serie) {
		double sum = 0;

		for (int i = index; i > index - 3; i--) {
			sum += indicador.calcula(i, serie);
		}

		return sum / 3.0;
	}

	@Override
	public String toString() {
		return "MMS - " + indicador.toString();
	}
}
