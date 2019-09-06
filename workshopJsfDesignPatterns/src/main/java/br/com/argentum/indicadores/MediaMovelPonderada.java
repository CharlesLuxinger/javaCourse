package br.com.argentum.indicadores;

import br.com.argentum.model.SerieTemporal;

public class MediaMovelPonderada implements Indicador {

	private Indicador indicador = new IndicadorFechamento();

	public MediaMovelPonderada() {

	}

	public MediaMovelPonderada(Indicador indicador) {
		this.indicador = indicador;

	}

	@Override
	public double calcula(int index, SerieTemporal serie) {
		double sum = 0;
		int peso = 3;

		for (int i = index; i > index - 3; i--) {
			sum += indicador.calcula(i, serie) * peso;
			peso--;
		}

		return sum / 6.0;
	}

	@Override
	public String toString() {
		return "MMP - " + indicador.toString();
	}
}
