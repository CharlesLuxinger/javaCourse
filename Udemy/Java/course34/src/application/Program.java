package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		/*
		 * Bloco try-with-resources � � um bloco try que declara um ou mais recursos, e
		 * garante que esses recursos ser�o fechados ao final do bloco
		 */
		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// A partir do FileReader instacia o BufferedReader assim sendo uma abstra��o,
			// permitindo tornar-se mais r�pido a leitura;

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}

	}

}
