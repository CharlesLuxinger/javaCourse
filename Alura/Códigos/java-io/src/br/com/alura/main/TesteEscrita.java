package br.com.alura.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// Output File
		OutputStream file = new FileOutputStream("C:\\temp\\out.txt");
		Writer output = new OutputStreamWriter(file);
		BufferedWriter bw = new BufferedWriter(output);

		bw.write("1. Teste saída!!!!");
		bw.newLine();
		bw.write("2. Teste saída!!!!");

		bw.close();
	}

}
