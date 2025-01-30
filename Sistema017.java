package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

import br.pe.tlrcampos.utils.CurrencyConverter;

public class Sistema017 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dolars = sc.nextDouble();
		System.out.printf("Amount to be in reais = %.2f", CurrencyConverter.paidInReais(price, dolars) );
		

		sc.close();
	}

}
