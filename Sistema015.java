package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

import br.pe.tlrcampos.entities.Employee;

public class Sistema015 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Gross salary: ");
		Double salary = sc.nextDouble();
		System.out.println("TAX: ");
		Double tax = sc.nextDouble();
		Employee employee = new Employee(name, salary, tax);

		System.out.println("Employee: " + employee.getNome() + ", $" + employee.netSalary());
		System.out.println();
		System.out.println("Witch percentage to increase salary? ");
		Double increase = sc.nextDouble();
		System.out.println();
		System.out.printf("Update data: " + employee.getNome() + ", %.2f", employee.increaseSalary(increase));

		System.out.println("\n" + employee);
		sc.close();
	}
}
