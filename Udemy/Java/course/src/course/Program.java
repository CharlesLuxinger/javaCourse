package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello World");
		
		sc.close();
		
		// Tipos Primitivos
		boolean  completed = false;
		char gender = 'F';
		byte n1 = 126;
		int n2 = 2147483647;
		long n3 = 2147483648L;
		float n5 = 4.5f;
		double n6 = 4.5;
		
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n5);
		System.out.println(n6);
		
		// Cast
		
		double a1 = 5.0;
		float b1 = (float)a1;
		System.out.println(b1);
		//
		
		double a2 = 5.7;
		int b2 = (int)a2;
		System.out.println(b2);
		
		//
		
		int a3 = 5;
		int b3 = 2;
		System.out.println((double)a3/b3);
		
		//
		
		String a4 = "5";
		int b4 = 2;
		double result;
		
		result = Double.parseDouble(a4) / (double)b4;
		System.out.println(result);
		
		
		// Sa�da de dados
		String pessoa = "Maria";
		char g = 'F';
		double a5 = 10.4564;
		int b5 = 22;
		System.out.print("Teste1");
		System.out.println("Teste2");
		System.out.printf("%.2f", a5);
		System.out.printf("%.2f%n", a5);
		Locale.setDefault(Locale.US);
		
		System.out.printf("A idade da %s �: %d, sexo: %c e possui R$: %.2f %n", pessoa, b5, g, a5);
		
		// Fun��es Matem�ticas		
		double a= 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b*b - 4.0 * a * c))/(2*a);
		System.out.println(x1);
		
		//
	}

}
