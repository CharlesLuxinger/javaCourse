package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produto> produtos = new ArrayList<Produto>();

		Scanner sc = new Scanner(System.in);

		// C:\temp\summary.csv
		System.out.print("Enter a file path: ");
		String sourceFileStr = "C:\\temp\\summary.csv";

		File targetFile = new File(sourceFileStr);
		String targetFileStr = targetFile.getParent();
		boolean success = new File(targetFileStr + "\\out").mkdir();

		targetFileStr = targetFileStr + "\\out\\summary.csv";

		try (BufferedReader fileIn = new BufferedReader(new FileReader(sourceFileStr))) {

			String lineData;

			while ((lineData = fileIn.readLine()) != null) {
				String[] dados = lineData.split(",");
				String descricao = dados[0].trim();
				double preco = Double.parseDouble(dados[1].trim());
				int quantidade = Integer.parseInt(dados[2].trim());
				Produto produto = new Produto(descricao, preco, quantidade);
				produtos.add(produto);
			}

			if (success) {

				try (BufferedWriter fileOut = new BufferedWriter(new FileWriter(targetFileStr))) {
					int line = 1;
					for (Produto list : produtos) {
						fileOut.write("#" + line + " Produto:" + list.getDescricao() + " Total:" + list.subTotal());
						fileOut.newLine();
						line++;
					}
					System.out.println(targetFileStr + " Created!");

				} catch (IOException ioe) {
					System.out.println("Out File Error: " + ioe.getMessage());
				}

			}
		} catch (

		IOException ioe) {
			System.out.println("In File Error: " + ioe.getMessage());
		}

		sc.close();
	}

}
