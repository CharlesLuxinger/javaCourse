package br.com.alura.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {
	public static void main(String[] args) throws IOException {
		Properties props = new Properties(); 
		props.setProperty("login", "charles"); //chave, valor
		props.setProperty("senha", "charles123");
		props.setProperty("endereco", "www.site.com.br");
		
		props.store(new FileWriter("conf.properties"), "algum comentário");
		
		
		//Leitura de properties

		props.load(new FileReader("conf.properties"));

		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);
	}
}
