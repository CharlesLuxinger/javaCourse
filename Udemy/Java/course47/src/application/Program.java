package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// <?> Tipo curinga
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("ABC", "XYZ", "AWS");
		printList(myStr);

	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
