package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// A partir do FileReader instacia o BufferedReader assim sendo uma abstra��o,
			// permitindo tornar-se mais r�pido a leitura;
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		} finally {
			// � necess�rio tratar o fechamento das Streams, por ser poss�vel um erro no fechamento.
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
