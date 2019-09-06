package br.com.argentum.indicadores;

import br.com.argentum.model.SerieTemporal;

public class MediaMovelSimples implements Media {

	@Override
	public double calcula(int index, SerieTemporal serie) {
		double sum = 0;

		for (int i = index; i > index - 3; i--) {
			sum += serie.getCandlesticksById(i).getFechamento();
		}

		return sum / 3.0;
	}
}
