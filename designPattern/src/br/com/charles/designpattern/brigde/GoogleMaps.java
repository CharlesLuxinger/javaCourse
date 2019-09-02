package br.com.charles.designpattern.brigde;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String getMapa(String rua) {
		String googleMaps = "http://maps.google.com.br/maps?q=rua+gustavo+dos+anjos";
		try {
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return "mapa";
	}

}
