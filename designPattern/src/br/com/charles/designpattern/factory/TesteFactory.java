package br.com.charles.designpattern.factory;

import java.sql.Connection;

public class TesteFactory {
	public static void main(String[] args) {

		// Diferença entre builder x factory
		// Builder: criação de objetos complexos(muitos parametros)
		// Factory: criação de objetos simples(pouco lógica)
		Connection con = new ConnectionFactory().getConnection();
	}
}
