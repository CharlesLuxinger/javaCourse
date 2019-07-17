package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Employee> list = new ArrayList<Employee>();

		Scanner sc = new Scanner(System.in);

		// C:\temp\in.txt
		System.out.print("Enter full file path:");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				double salary = Double.parseDouble(fields[2]);

				list.add(new Employee(name, email, salary));
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();

			System.out.println("Email of people whose salary is more than $" 
									+ String.format("%.2f", salary));

			List<String> emails = list.stream()
									  .filter(e -> e.getSalary() > salary)
									  .map(e -> e.getEmail())
									  .sorted()
									  .collect(Collectors.toList());

			emails.forEach(System.out::println);

			double totalSalary = list.stream()
									 .filter(e -> e.getName().charAt(0) == 'M')
									 .map(e -> e.getSalary())
									 .reduce(0.0, (x, y) -> x + y);

			System.out.println("Sum of salary of people whose name starts with 'M': " 
									+ String.format("%.2f", totalSalary));

		} catch (IOException ioe) {
			System.out.println("IO Error: " + ioe.getMessage());
		}

		sc.close();

	}

}
