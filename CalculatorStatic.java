package br.pe.tlrcampos.utils;

public class CalculatorStatic {

	public static final Double PI = 3.14159;
	
	private CalculatorStatic() {
		// TODO Auto-generated constructor stub
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3;
	}

}
