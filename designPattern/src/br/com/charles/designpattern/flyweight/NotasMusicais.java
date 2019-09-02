package br.com.charles.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	static {
		notas.put("DO", new Do());
		notas.put("RE", new Re());
		notas.put("MI", new Mi());
		notas.put("FA", new Fa());
		notas.put("SOL", new Sol());
		notas.put("LA", new La());
		notas.put("SI", new Si());
	}

	public Nota getNota(String nome) {
		return notas.get(nome);
	}
}
