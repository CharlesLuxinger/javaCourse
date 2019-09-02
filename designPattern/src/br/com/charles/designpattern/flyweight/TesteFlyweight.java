package br.com.charles.designpattern.flyweight;

import java.util.Arrays;
import java.util.List;

public class TesteFlyweight {
	public static void main(String[] args) {
		NotasMusicais notasMusicais = new NotasMusicais();

		List<Nota> musica = Arrays.asList(notasMusicais.getNota("DO"), notasMusicais.getNota("RE"),
				notasMusicais.getNota("MI"), notasMusicais.getNota("FA"), notasMusicais.getNota("FA"),
				notasMusicais.getNota("FA"));
	}

}
