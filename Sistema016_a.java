package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

public class Sistema016_a {
	
	public static final Double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		System.out.printf("Circunference: %.2f%n", c);
		double v = volume(radius);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);

		sc.close();
	}

	private static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	private static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3;
	}

}
