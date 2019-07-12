package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		/*
		 * Bloco try-with-resources • É um bloco try que declara um ou mais recursos, e
		 * garante que esses recursos serão fechados ao final do bloco
		 */
		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// A partir do FileReader instacia o BufferedReader assim sendo uma abstração,
			// permitindo tornar-se mais rápido a leitura;

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
