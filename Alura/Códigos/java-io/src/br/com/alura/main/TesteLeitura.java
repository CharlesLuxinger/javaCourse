package br.com.alura.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Input File
		FileInputStream file = new FileInputStream("C:\\temp\\lorem.txt");
		InputStreamReader input = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(input);

		String line = br.readLine();

		System.out.println(line);

		br.close();
	}

}
