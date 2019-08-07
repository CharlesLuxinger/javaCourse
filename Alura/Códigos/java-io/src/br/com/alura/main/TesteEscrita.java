package br.com.alura.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
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

		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\temp\\out2.txt"));
		bw2.write("1. Teste saída!!!!");
		bw.newLine();
		bw2.write("2. Teste saída!!!!");
		bw2.close();

		PrintStream ps = new PrintStream("C:\\temp\\out3.txt");
		ps.println("1. Teste saída!!!!");
		ps.println();
		ps.println("1. Teste saída!!!!");
		ps.close();

		PrintWriter pw = new PrintWriter("C:\\temp\\out4.txt");
		pw.println("1. Teste saída!!!!");
		pw.println();
		pw.println("1. Teste saída!!!!");
		pw.close();
	}

}
