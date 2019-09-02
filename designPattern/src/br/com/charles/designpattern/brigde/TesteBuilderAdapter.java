package br.com.charles.designpattern.brigde;

import java.io.IOException;

public class TesteBuilderAdapter {
	public static void main(String[] args) throws IOException {
		Mapa mapa = new GoogleMaps();
		mapa.getMapa("Rua 2");

		mapa = new MapLink();
		mapa.getMapa("Rua 2");
	}
}
