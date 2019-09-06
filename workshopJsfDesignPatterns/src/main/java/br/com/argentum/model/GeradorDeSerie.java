package br.com.argentum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GeradorDeSerie {

	public static SerieTemporal criaSerie(double... valores) {
		List<Candlestick> candles = new ArrayList<Candlestick>();

		for (double valor : valores) {
			candles.add(new Candlestick(valor, valor, valor, valor, valor, LocalDateTime.now()));
		}

		return new SerieTemporal(candles);
	}

}
