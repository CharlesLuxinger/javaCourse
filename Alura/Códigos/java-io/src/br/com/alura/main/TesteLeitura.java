package br.com.alura.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Locale;
import java.util.Scanner;

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

		Scanner sc = new Scanner(new File("C:\\temp\\test.csv"));
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());

			sc.useLocale(Locale.US);
			sc.useDelimiter(",");
			String field1 = sc.next();
			int field2 = sc.nextInt();
			double field3 = sc.nextDouble();

			//Preenche com espaço
			String fmt1 = String.format("%10s", field1);
			//Preenche com zero
			String fmt2 = String.format("%08d", field2);
			String fmt3 = String.format(new Locale("pt", "BR"), "%05.2f", field3);

			String[] fields = sc.nextLine().split(",");
			System.out.println(fields);
		}
		sc.close();

	}

}
