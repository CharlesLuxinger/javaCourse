package br.com.argentum.indicadores;

import org.junit.Assert;
import org.junit.Test;

import br.com.argentum.model.GeradorDeSerie;
import br.com.argentum.model.SerieTemporal;

public class MediaMovelSimplesTest {

	@Test
	public void sequenciaSimplesDeCandles() {
		SerieTemporal criaSerie = GeradorDeSerie.criaSerie(1, 2, 3, 4, 3, 4, 5);

		MediaMovelSimples mms = new MediaMovelSimples();

		Assert.assertEquals(6.0 / 3.0, mms.calcula(2, criaSerie), 0.00001);
		Assert.assertEquals(9.0 / 3.0, mms.calcula(3, criaSerie), 0.00001);
		Assert.assertEquals(10.0 / 3.0, mms.calcula(4, criaSerie), 0.00001);
		Assert.assertEquals(11.0 / 3.0, mms.calcula(5, criaSerie), 0.00001);
		Assert.assertEquals(12.0 / 3.0, mms.calcula(6, criaSerie), 0.00001);
	}

}
