package br.pe.tlrcampos.entities.application;

import java.util.Locale;
import java.util.Scanner;

import br.pe.tlrcampos.entities.Account;

public class Sistema019 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account = entradaDeDadosInicial(sc);

		System.out.println(account);

		movimentarAccount(sc, account, "deposit");

		movimentarAccount(sc, account, "withdraw");

		sc.close();
	}

	private static Account entradaDeDadosInicial(Scanner sc) {
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there an intial deposit? ");
		Double balance = 0.0;

		char opcao;

		do {
			opcao = sc.next().toLowerCase().charAt(0);

			if (opcao == 's') {
				System.out.println("Enter initial deposit value:");
				balance = sc.nextDouble();
			} else if (opcao == 'n') {
				break;
			}

		} while (opcao != 's');

		return new Account(holder, number, balance);
	}

	private static void movimentarAccount(Scanner sc, Account account, String tipo) {
		System.out.println();
		String movimentacao = (tipo.equals("deposit")) ? tipo : "withdraw";
		System.out.println("Enter a " + movimentacao + " value:");
		Double balance = sc.nextDouble();
		if (tipo.equals("deposit")) {
			account.deposit(balance);
		} else if (tipo.equals("withdraw")) {
			account.withdraw(balance);
		}
		System.out.println("Update " + account);
	}

}
