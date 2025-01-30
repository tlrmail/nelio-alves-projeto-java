package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

import br.pe.tlrcampos.entities.Product;

public class Sistema018 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = inserirDados(sc);
		print("Product data: ", product);

		System.out.println();
		adicionarProdutosEmEstoque(product, sc);
		print("Update data: ", product);
		
		System.out.println();
		removerProdutosEmEstoque(product, sc);
		print("Update data: ", product);
		
		sc.close();
	}
	
	private static Product inserirDados(Scanner sc) {
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		Integer quantity = sc.nextInt();
		return new Product(name, price, quantity);		
	}

	private static void adicionarProdutosEmEstoque(Product p, Scanner sc) {
		System.out.print("Enter the number of products to be added in stock: ");
		Integer quantity = sc.nextInt();
		p.addProducts(quantity);
	}

	private static void removerProdutosEmEstoque(Product p, Scanner sc) {
		System.out.print("Enter the number of products to be removed in stock: ");
		Integer quantity = sc.nextInt();
		p.removeProducts(quantity);
	}
	
	private static void print(String preMensagem,Product p) {
		System.out.println(preMensagem + p.toString());
	}
}
