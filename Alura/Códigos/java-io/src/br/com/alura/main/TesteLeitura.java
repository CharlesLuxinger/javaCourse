package br.com.alura.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Input File
		InputStream file = new FileInputStream("C:\\temp\\lorem.txt");
		Reader input = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(input);

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		br.close();
	}

}
