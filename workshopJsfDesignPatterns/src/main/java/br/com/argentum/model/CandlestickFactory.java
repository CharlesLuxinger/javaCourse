package br.com.argentum.model;

import java.time.LocalDateTime;
import java.util.List;

public class CandlestickFactory {
	public Candlestick getCandlestickByDate(List<Negociacao> negociacoes, LocalDateTime data) {
		double abertura = negociacoes.get(0).getPreco();
		double fechamento = negociacoes.get(negociacoes.size() - 1).getPreco();

		double minimo = negociacoes.get(0).getPreco();
		double maximo = negociacoes.get(0).getPreco();

		double volume = 0.0;

		for (Negociacao negociacao : negociacoes) {
			volume += negociacao.getVolume();
			minimo = (negociacao.getPreco() < minimo ? negociacao.getPreco() : minimo);
			maximo = (negociacao.getPreco() > maximo ? negociacao.getPreco() : maximo);
		}

		return new Candlestick(abertura, fechamento, maximo, minimo, volume, data);
	}
}
