package br.com.argentum.model;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

public class NegociacaoTest {

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveCriarNegociaComPrecoNegativo() {
		new Negociacao(-20, 2, LocalDateTime.now());
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveCriarNegociaComQuantidadeMenorIgualZero() {
		new Negociacao(20, 0, LocalDateTime.now());
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveCriarNegociaSemData() {
		new Negociacao(20, 1, null);
	}

	@Test
	public void testCalculoVolume() {
		double preco = 2;
		int quantidade = 2;
		Negociacao negociacao = new Negociacao(preco, quantidade, LocalDateTime.now());

		assertEquals(preco * quantidade, negociacao.getVolume(), 0.01);
	}

	@Test
	public void mesmoDia() {
		Negociacao negociacao = new Negociacao(100, 1, LocalDateTime.now());

		Assert.assertTrue(negociacao.dateIsEqual(LocalDateTime.now()));
	}

}
