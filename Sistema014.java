package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

import br.pe.tlrcampos.entities.Rectangle;

public class Sistema014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = entradaDeDados(sc);

		print(rectangle);
		
		sc.close();

	}

	private static Rectangle entradaDeDados(Scanner sc) {
		System.out.println("Enter rectangle width and height: ");
		double height = sc.nextDouble();
		double width = sc.nextDouble();
		return new Rectangle(height, width);
	}

	private static void print(Rectangle rectangle) {
		System.out.printf("AREA: %.4f%n", rectangle.area());
		System.out.printf("PERIMETER: %.4f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.4f%n", rectangle.diagonal());
	}
}
