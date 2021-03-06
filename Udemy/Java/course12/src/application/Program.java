package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Insert X value: ");
		int x = sc.nextInt();
		System.out.print("Insert Y value: ");
		int y = sc.nextInt();
		int[][] mat = new int[x][y];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print("Insert positions " + (i + 1) + ", " + (j + 1) + ", values: ");
				mat[i][j] = sc.nextInt();
			}

		}

		System.out.print("Insert a number: ");
		int z = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				
				if (mat[i][j] == z) {
					System.out.print("X, Y position: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}

		}

		sc.close();
	}
}
