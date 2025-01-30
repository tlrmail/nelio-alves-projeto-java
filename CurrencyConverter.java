package br.pe.tlrcampos.utils;

public class CurrencyConverter {

	private static final Double IOF = 1.06;
	
	public static Double paidInReais(Double price, Double dolars) {
		return IOF * dolars * price;
	}
	
}
