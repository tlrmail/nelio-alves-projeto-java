package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

import br.pe.tlrcampos.utils.Calculator;

public class Sistema016_b {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circumference(radius);
		System.out.printf("Circunference: %.2f%n", c);
		double v = calculator.volume(radius);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);

		sc.close();
	}

}
