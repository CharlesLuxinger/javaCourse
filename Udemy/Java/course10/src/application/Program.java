package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Program {
	public static void main(String[] args) {
		List<Emplyoee> employees = new ArrayList<>();

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("How many emplyoees will be registered? ");
		int numberEmployes = sc.nextInt();

		for (int i = 0; i < numberEmployes; i++) {
			System.out.print("Employee ID #" + (i + 1) + ": ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Employee Name #" + (i + 1) + ": ");
			String name = sc.nextLine();
			System.out.print("Employee Salary #" + (i + 1) + ": ");
			double salary = sc.nextDouble();
			employees.add(new Emplyoee(id, name, salary));

			if (i + 1 == numberEmployes) {
				System.out.println("Employee ID #" + (i + 1) + ", Registered!!!");
				System.out.println("-------------------------------------");
				System.out.println("End Registers!!!");
				System.out.println("-------------------------------------");
			} else {
				System.out.println("Employee ID #" + (i + 1) + ", Registered!!!");
				System.out.println("-------------------------------------");
			}
		}

		Emplyoee emp = new Emplyoee();

		do {
			System.out.print("Enter the employee id that will have salary increase: ");
			int id = sc.nextInt();
			emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("-------------------------------------");
				System.out.println("Error!!! Employee id does not exists!!!");
				System.out.println("-------------------------------------");
			}
		}
		while (emp == null);
		
		System.out.print("Enter de salary increese percente: ");
		double percente = sc.nextDouble();
		emp.increeseSalary(percente);

		for (Emplyoee list : employees) {
			System.out.print(list);
		}

		sc.close();
	}
}

/*
	 * Tamanho da lista: size() � Obter o elemento de uma posi��o: get(position)
	 * Inserir elemento na lista: add(obj), add(int, obj) � Remover elementos da
	 * lista: remove(obj), remove(int), removeIf(Predicate) � Encontrar posi��o de
	 * elemento: indexOf(obj), lastIndexOf(obj) � Filtrar lista com base em
	 * predicado: List<Integer> result = list.stream().filter(x -> x >
	 * 4).collect(Collectors.toList()); � Encontrar primeira ocorr�ncia com base em
	 * predicado: Integer result = list.stream().filter(x -> x >
	 * 4).findFirst().orElse(null);
 */
