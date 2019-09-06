package br.com.argentum.model;

import java.util.Collections;
import java.util.List;

public class SerieTemporal {

	private final List<Candlestick> candlesticks;

	public SerieTemporal(List<Candlestick> candlesticks) {
		this.candlesticks = candlesticks;
	}

	public Candlestick getCandlesticksById(int index) {
		return candlesticks.get(index);
	}

	public int getUltimaPosicao() {
		return candlesticks.size() - 1;
	}

	public List<Candlestick> getCandlesticks() {
		return Collections.unmodifiableList(candlesticks);
	}

}
