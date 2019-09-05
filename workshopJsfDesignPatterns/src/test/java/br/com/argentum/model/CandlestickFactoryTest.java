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

	@Test
	public void negociacaoComDatasDiferentesGeraCandlesDiferentes() {
		LocalDateTime hoje = LocalDateTime.now();

		Negociacao negociacao1 = new Negociacao(50.0, 20, hoje);
		Negociacao negociacao2 = new Negociacao(100.0, 20, hoje);
		Negociacao negociacao3 = new Negociacao(150.0, 20, hoje);

		LocalDateTime amanha = hoje.plusDays(1);

		Negociacao negociacao4 = new Negociacao(50.0, 100, amanha);
		Negociacao negociacao5 = new Negociacao(10.0, 20, amanha);

		LocalDateTime depois = amanha.plusDays(1);

		Negociacao negociacao6 = new Negociacao(35.0, 20, depois);
		Negociacao negociacao7 = new Negociacao(35.0, 20, depois);

		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4, negociacao5,
				negociacao6, negociacao7);

		CandlestickFactory cFactory = new CandlestickFactory();

		List<Candlestick> candlesticks = cFactory.getCandlestick(negociacoes);

		Assert.assertEquals(3, candlesticks.size());

		Assert.assertTrue(negociacoes.get(0).dateIsEqual(candlesticks.get(0).getData()));
		Assert.assertTrue(negociacoes.get(3).dateIsEqual(candlesticks.get(1).getData()));
		Assert.assertTrue(negociacoes.get(5).dateIsEqual(candlesticks.get(2).getData()));

		Assert.assertEquals(6000.0, candlesticks.get(0).getVolume(), 0.0000001);
		Assert.assertEquals(50.0, candlesticks.get(0).getMinimo(), 0.0000001);
		Assert.assertEquals(150.0, candlesticks.get(0).getMaximo(), 0.0000001);
		Assert.assertEquals(50.0, candlesticks.get(0).getAbertura(), 0.0000001);
		Assert.assertEquals(150.0, candlesticks.get(0).getFechamento(), 0.0000001);

	}
}
