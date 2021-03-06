package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double salary =  Double.parseDouble(fields[1]);
				
				list.add(new Employee(name, salary));
			}

			Collections.sort(list);

			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}

		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}
	}

}
