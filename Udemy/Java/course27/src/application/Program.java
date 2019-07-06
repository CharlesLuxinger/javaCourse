package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException aib) {
			System.out.println("Invalid Position!");

		} catch (InputMismatchException im) {
			System.out.println("Invalid Input Error!");
		}
		
		sc.close();

	}

}
