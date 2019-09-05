package br.com.argentum.webservice;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import br.com.argentum.model.Negociacao;
import br.com.argentum.reader.XMLReader;

public class ClientWebService {
	private static final String URL_WS = "http://argentumws.caelum.com.br/negociacoes";
	private HttpURLConnection connection;

	public List<Negociacao> getNegociacoes() {
		try {
			URL url = new URL(URL_WS);

			connection = (HttpURLConnection) url.openConnection();

			InputStream content = connection.getInputStream();

			return new XMLReader().getNegociacoesFromXML(content);

		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			connection.disconnect();
		}
	}

	public static void main(String[] args) {
		ClientWebService webService = new ClientWebService();

		List<Negociacao> negociacoes = webService.getNegociacoes();

		negociacoes.forEach(x -> System.out.println(x.getPreco()));
	}
}
