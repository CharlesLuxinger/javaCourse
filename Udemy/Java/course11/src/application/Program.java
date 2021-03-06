package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int x = 0; x < mat.length; x++) {

			for (int y = 0; y < mat[x].length; y++) {
				mat[x][y] = sc.nextInt();
			}
			
		}
		
		
		System.out.print ("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print (mat[i][i]);
		}
		
		
		int count = 0;
		for (int x = 0; x < mat.length; x++) {

			for (int y = 0; y < mat[x].length; y++) {
				if (mat[x][y] < 0) {
					++count;
				}
			}
			
		}
		System.out.print ("Negatives number quantity: " + count);
		

		sc.close();
	}
}
