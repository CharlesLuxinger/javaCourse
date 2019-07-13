package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// Princípio get/put - covariância
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		list.add(20); // erro de compilacao
		// get - OK
		// put - ERROR

		// Princípio get/put - contravariância
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		Number x = myNums.get(0); // erro de compilacao
		// get - ERROR
		// put - OK
	}

}
