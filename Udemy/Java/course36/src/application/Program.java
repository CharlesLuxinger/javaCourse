package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// isDirectory lista somente o que for diretório ou pasta
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		// isFile lista somente o que for arquivos
		File[] files = path.listFiles(File::isFile);

		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criar sub-pasta
		boolean success = new File(strPath + "\\New folder").mkdir();

		sc.close();
	}

}
