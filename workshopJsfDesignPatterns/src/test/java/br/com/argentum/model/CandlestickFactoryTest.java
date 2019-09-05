package br.com.argentum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CandlestickFactoryTest {

	@Test
	public void sequenciaNegocioesSimples() {
		Negociacao negociacao1 = new Negociacao(100.0, 5, LocalDateTime.now());
		Negociacao negociacao2 = new Negociacao(123.0, 5, LocalDateTime.now());
		Negociacao negociacao3 = new Negociacao(150.0, 5, LocalDateTime.now());
		Negociacao negociacao4 = new Negociacao(90.0, 5, LocalDateTime.now());

		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);

		CandlestickFactory cFactory = new CandlestickFactory();

		Candlestick candlestick = cFactory.getCandlestickByDate(negociacoes, LocalDateTime.now());

		Assert.assertEquals(90.0, candlestick.getMinimo(), 0.01);
		Assert.assertEquals(150.0, candlestick.getMaximo(), 0.01);
		Assert.assertEquals(100.0, candlestick.getAbertura(), 0.01);
		Assert.assertEquals(90.0, candlestick.getFechamento(), 0.01);
		Assert.assertEquals(2315.0, candlestick.getVolume(), 0.01);
	}

	@Test
	public void apenasUmaNegocicao() {
		Negociacao negociacao1 = new Negociacao(100.0, 5, LocalDateTime.now());

		List<Negociacao> negociacoes = Arrays.asList(negociacao1);

		CandlestickFactory cFactory = new CandlestickFactory();

		Candlestick candlestick = cFactory.getCandlestickByDate(negociacoes, LocalDateTime.now());

		Assert.assertEquals(100.0, candlestick.getMinimo(), 0.01);
		Assert.assertEquals(100.0, candlestick.getMaximo(), 0.01);
		Assert.assertEquals(100.0, candlestick.getAbertura(), 0.01);
		Assert.assertEquals(100.0, candlestick.getFechamento(), 0.01);
		Assert.assertEquals(500.0, candlestick.getVolume(), 0.01);
	}

	@Test
	public void apenasNenhumaNegociacao() {
		List<Negociacao> negociacoes = new ArrayList<Negociacao>();

		CandlestickFactory cFactory = new CandlestickFactory();

		Candlestick candlestick = cFactory.getCandlestickByDate(negociacoes, LocalDateTime.now());

		Assert.assertEquals(0.0, candlestick.getMinimo(), 0.01);
		Assert.assertEquals(0.0, candlestick.getMaximo(), 0.01);
		Assert.assertEquals(0.0, candlestick.getAbertura(), 0.01);
		Assert.assertEquals(0.0, candlestick.getFechamento(), 0.01);
		Assert.assertEquals(0.0, candlestick.getVolume(), 0.01);
	}
}
