package bank2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Account account;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter With The number Account;");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter with Holder");
		String name = sc.nextLine();

		System.out.println("Deposit initial value (Y/N)");
		char op = sc.next().charAt(0);

		
		if (op == 'Y' || op == 'y') {

			System.out.println("Enter Amount:");
			double initialdeposit = sc.nextDouble();

			account = new Account(number, name, initialdeposit);
		}

		
		else {
			
			account = new Account(number, name);
			
		}
		
		
		System.out.println("Account Data:");
		System.out.println(account);
		System.out.println();
		double amount;
		
		System.out.println("Enter a deposit value:");
		amount = sc.nextDouble();

		account.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();

		System.out.println("Enter a withdraw value:");
		amount = sc.nextDouble();

		account.withdraw(amount);

		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
	}

}
