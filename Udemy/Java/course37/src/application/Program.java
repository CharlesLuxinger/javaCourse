package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// Retorna o nome do arquivo
		System.out.println("getName: " + path.getName());

		// Retorna o caminho sem especificar o arquivo
		System.out.println("getParent: " + path.getParent());

		// Retorna o caminho com o arquivo
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}

}
