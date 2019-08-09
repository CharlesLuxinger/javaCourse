package br.com.alura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TesteList {
	public static void main(String[] args) {
		String text1 = "Test list 1";
		String text2 = "Test list 2";
		String text3 = "Test list 3";
		String text4 = "Test list 4";
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(text1);
		list.add(text2);
		list.add(text3);
		list.add(text4);
		
		list.addAll(Arrays.asList(text1,text2,text3,text4));
		
		list.remove(0);
		
		
		for (String string : list) {
			System.out.println(string);			
		}
		
		list.forEach(x -> System.out.println(x));
		
		Collections.sort(list);
	}
}
