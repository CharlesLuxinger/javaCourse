package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Celular");
		set.add("Tablet");

		System.out.println(set.contains("Celular"));

		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		set.remove("Celular");
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		set.removeIf(x -> x.length() >= 3);
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Set<Integer> a = new TreeSet<Integer>(Arrays.asList(0,2,4,5,6,7,8,10));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5,6,7,8,9,10));
		
		//Union
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		
		
		//Intersection
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);	
		
		
		
		//Difference
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
		
		
	}

}
