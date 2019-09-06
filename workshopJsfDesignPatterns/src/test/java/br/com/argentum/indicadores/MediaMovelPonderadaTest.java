package br.com.argentum.indicadores;

import org.junit.Assert;
import org.junit.Test;

import br.com.argentum.model.GeradorDeSerie;
import br.com.argentum.model.SerieTemporal;

public class MediaMovelPonderadaTest {

	@Test
	public void sequenciaSimplesDeCandles() {
		SerieTemporal criaSerie = GeradorDeSerie.criaSerie(1, 2, 3, 4, 5, 6);

		MediaMovelPonderada mmp = new MediaMovelPonderada();

		Assert.assertEquals(14.0 / 6.0, mmp.calcula(2, criaSerie), 0.00001);
		Assert.assertEquals(20.0 / 6.0, mmp.calcula(3, criaSerie), 0.00001);
		Assert.assertEquals(26.0 / 6.0, mmp.calcula(4, criaSerie), 0.00001);
		Assert.assertEquals(32.0 / 6.0, mmp.calcula(5, criaSerie), 0.00001);
	}

}
