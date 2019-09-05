package br.com.argentum.model;

import java.time.LocalDateTime;

import org.junit.Test;

public class CandlestickTest {

	@Test(expected = IllegalArgumentException.class)
	public void maximoNaoDeveSerMenorQueMinimo() {
		CandlestickBuilder builder = new CandlestickBuilder();

		@SuppressWarnings("unused")
		Candlestick candlestick = builder.setAbertura(10.0).setFechamento(15).setMinimo(20).setMaximo(15)
		.setData(LocalDateTime.now()).setVolume(150).build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void dataNaoPodeSerNula() {
		CandlestickBuilder builder = new CandlestickBuilder();

		@SuppressWarnings("unused")
		Candlestick candlestick = builder.setAbertura(10.0).setFechamento(15).setMinimo(20).setMaximo(15)
		.setData(null).setVolume(150).build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoAceitaValoresMenoresQueZero() {
		CandlestickBuilder builder = new CandlestickBuilder();

		@SuppressWarnings("unused")
		Candlestick candlestick = builder.setAbertura(-1.0).setFechamento(-1.0).setMinimo(-1.0).setMaximo(-1.0)
		.setData(LocalDateTime.now()).setVolume(-1.0).build();
	}

}
