package course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGetData {

	public static void main(String[] args) {
		// Entrada de Dados
		Locale.setDefault(Locale.US); // Deve ser declarado antes da instanciação de um objeto scanner
		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();
		String x, y, z;
		// Captura palavras em linha diferentes 1 palavra em cada linha, como também
		// captura palavras separadas na mesma linha
		x = sc.next();
		y = sc.next();
		z = sc.next();

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		x = sc.next();
		y = sc.next();
		z = sc.next();

		sc.close();

		Scanner sc2 = new Scanner(System.in);

		// Sempre que antes do método nextLine houver um outro método de entrada de
		// dados, é necessário invocar(flush)
		// o método nextLine para consumir a quebra de linha anterior;
		int n1 = sc2.nextInt();
		sc2.nextLine();
		String name = sc2.nextLine();
		char gender = sc2.nextLine().charAt(0);

		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);

		//

		String s = sc2.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));

		System.out.println(s);
		System.out.println(letter);
		System.out.println(digit);

		//

		double n2 = sc2.nextDouble();

		System.out.println(n2);

		// Maria F 23 1.68

		String name2 = sc2.next();
		char ch = sc2.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();

		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);

		sc2.close();

	}

}
