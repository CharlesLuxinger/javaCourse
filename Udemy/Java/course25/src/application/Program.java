package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		/*
		 * M�todos abstratos � S�o m�todos que n�o possuem implementa��o. � M�todos
		 * precisam ser abstratos quando a classe � gen�rica demais para conter sua
		 * implementa��o. � Se uma classe possuir pelo menos um m�todo abstrato, ent�o
		 * esta classe tamb�m � abstrata. � Nota��o UML: it�lico.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<Shape>();

		System.out.print("Enter the numer of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle(r/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (Black/Red/Green): ");
			Color color = Color.valueOf(sc.next().toUpperCase());

			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();

				list.add(new Rectangle(color, width, height));

			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println("\nShape Areas:");
		for (Shape shp : list) {
			System.out.println(String.format("%.2f", shp.area()));
		}

		sc.close();
	}

}
