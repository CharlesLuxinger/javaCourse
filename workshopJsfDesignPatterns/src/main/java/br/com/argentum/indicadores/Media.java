package br.com.argentum.indicadores;

import br.com.argentum.model.SerieTemporal;

public interface Media {
	double calcula(int index, SerieTemporal serie);
}
