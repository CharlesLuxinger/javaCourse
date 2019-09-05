package br.com.argentum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CandlestickFactory {

	public Candlestick getCandlestickByDate(List<Negociacao> negociacoes, LocalDateTime data) {
		double abertura = 0;
		double fechamento = 0;
		double minimo = 0;
		double maximo = 0;
		double volume = 0;

		if (!negociacoes.isEmpty()) {
			abertura = negociacoes.get(0).getPreco();
			fechamento = negociacoes.get(negociacoes.size() - 1).getPreco();

			minimo = negociacoes.get(0).getPreco();
			maximo = negociacoes.get(0).getPreco();

			volume = 0.0;

			for (Negociacao negociacao : negociacoes) {
				volume += negociacao.getVolume();
				minimo = (negociacao.getPreco() < minimo ? negociacao.getPreco() : minimo);
				maximo = (negociacao.getPreco() > maximo ? negociacao.getPreco() : maximo);

			}
		}

		return new Candlestick(abertura, fechamento, maximo, minimo, volume, data);
	}

	public List<Candlestick> getCandlestick(List<Negociacao> negociacoes) {
		if (!negociacoes.isEmpty()) {
			Candlestick candlestick;

			List<Candlestick> candlesticks = new ArrayList<Candlestick>();
			List<Negociacao> negociacoesDoDia = new ArrayList<Negociacao>();

			LocalDateTime dataAtual = negociacoes.get(0).getData();

			for (Negociacao negociacao : negociacoes) {
				if (negociacao.dateIsEqual(dataAtual)) {
					negociacoesDoDia.add(negociacao);
				} else {
					candlestick = getCandlestickByDate(negociacoesDoDia, dataAtual);
					candlesticks.add(candlestick);
					negociacoesDoDia = new ArrayList<Negociacao>();
					dataAtual = negociacao.getData();
				}
			}

			candlestick = getCandlestickByDate(negociacoesDoDia, dataAtual);
			candlesticks.add(candlestick);

			return candlesticks;
		}
		return null;
	}
}
