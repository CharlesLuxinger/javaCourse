package br.com.argentum.indicadores;

import java.lang.reflect.Constructor;

public class IndicadorFactory {

	private String nomeMedia;
	private String nomeIndicadorBase;

	public IndicadorFactory(String nomeMedia, String nomeIndicadorBase) {
		this.nomeMedia = nomeMedia;
		this.nomeIndicadorBase = nomeIndicadorBase;
	}

	public Indicador getIndicador() {
		if (nomeIndicadorBase == null || nomeMedia == null) {
			return new MediaMovelSimples(new IndicadorFechamento());
		}

		String pacote = "br.com.argentum.indicadores.";
		try {
			Class<?> indicadorBaseClass = Class.forName(pacote + nomeIndicadorBase);
			Indicador indicadorBase = (Indicador) indicadorBaseClass.newInstance();

			Class<?> mediaClass = Class.forName(pacote + nomeMedia);
			Constructor<?> constructor = mediaClass.getConstructor(Indicador.class);

			Indicador indicador = (Indicador) constructor.newInstance(indicadorBase);

			return indicador;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
