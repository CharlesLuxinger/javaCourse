package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();		
		System.out.println("End of Program");
	}
	
	public static void method1() {
		System.out.println("***#1. Start***");
		method2();
		System.out.println("***#1. End***");
	}

	public static void method2() {
		System.out.println("***#2. Start***");
		Scanner sc = new Scanner(System.in);
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException aib) {
			
			System.out.println("Invalid Position!");
			aib.printStackTrace();
			
		} catch (InputMismatchException im) {
			
			System.out.println("Invalid Input Error!");
			im.printStackTrace();
		}
		System.out.println("***#2. End***");
		sc.close();
	}
	
}
