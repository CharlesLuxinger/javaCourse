package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<Shape>();

		myShapes.add(new Rectangle(Color.BLACK,3.0, 2.0));
		myShapes.add(new Circle(Color.BLACK,2.0));

		System.out.println("Total area: " + totalArea(myShapes));
		
		List<Circle> myCircles = new ArrayList<Circle>();

		myShapes.add(new Circle(Color.BLACK,3.0));
		myShapes.add(new Circle(Color.BLACK,2.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
