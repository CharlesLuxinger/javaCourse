package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, Integer> maps = new TreeMap<String, Integer>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\in.txt"))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);

				if (maps.containsKey(nome)) {
					int v = maps.get(nome);
					maps.put(nome, v + votos);
				} else {
					maps.put(nome,votos);
				}
			}

			for (String key : maps.keySet()) {
				System.out.println(key + ": " + maps.get(key));
			}
			
		} catch (IOException ioe) {
			System.out.println("IO Error: " + ioe.getMessage());
		}

	}

}
