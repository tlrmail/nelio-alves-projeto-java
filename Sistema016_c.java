package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

import br.pe.tlrcampos.utils.CalculatorStatic;

public class Sistema016_c {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double c = CalculatorStatic.circumference(radius);
		double v = CalculatorStatic.volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorStatic.PI);

		sc.close();
	}

}
