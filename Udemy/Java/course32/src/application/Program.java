package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Working with Files
		File file = new File("c:\\temp\\in.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException io) {
			System.out.println("Error: " + io.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
