package br.com.argentum.indicadores;

import br.com.argentum.model.SerieTemporal;

public class MediaMovelPonderada implements Media {
	@Override
	public double calcula(int index, SerieTemporal serie) {
		double sum = 0;
		int peso = 3;

		for (int i = index; i > index - 3; i--) {
			sum += serie.getCandlesticksById(i).getFechamento() * peso;
			peso--;
		}

		return sum / 6.0;
	}
}
