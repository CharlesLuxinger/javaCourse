package br.com.alura.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		// Input File
		InputStream fileIn = new FileInputStream("C:\\temp\\lorem.txt");
		Reader input = new InputStreamReader(fileIn);
		BufferedReader br = new BufferedReader(input);

		// Output File
		OutputStream fileOut = new FileOutputStream("C:\\temp\\out.txt");
		Writer output = new OutputStreamWriter(fileOut);
		BufferedWriter bw = new BufferedWriter(output);

		String line = br.readLine();

		while (line != null && !line.isEmpty()) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
		}

		br.close();
		bw.close();
	}

}
