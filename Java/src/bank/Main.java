 package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER ACCOUNT HOLDER: ");
		String name = sc.nextLine();

		System.out.println("ENTER ACCOUNT NUMBER: ");
		int account = sc.nextInt();
		sc.nextLine();

		System.out.println("IS THERE NA INITIAL DEPOSIT? (Y/N): ");
		char opc = sc.next().charAt(0);

		double deposit = 0.0;

		if (opc == 'Y' || opc == 'y') {

			System.out.println("ENTER INITIAL DEPOSIT VALUE: ");
			deposit = sc.nextDouble();

		}

		BankAccount bk = new BankAccount(name, account, deposit);
		
		System.out.println("ACCOUNT CREATED SUCCESSFULLY!");
		System.out.println(bk + "\n");

		char ops;

		boolean b = true;

		do {

			System.out.println("1 - ALTER NAME: ");
			System.out.println("2 - PRINT INFORMATION ACCOUNT: ");
			System.out.println("3 - NEW DEPOSIT: ");
			System.out.println("4 - NEW WITHDRAW: ");
			System.out.println("5 - EXIT: ");

			System.out.print("ENTER OPTION: ");
			ops = sc.next().charAt(0);
			sc.nextLine();

			switch (ops) {
			case '1':
				System.out.println("ENTER NEW NAME:");
				String newName = sc.nextLine();
				bk.setName(newName);
				System.out.println("UPDATE NAME!");

				break;

			case '2':
				System.out.println(bk);
				break;
			case '3':
				System.out.println("ENTER A DEPOSIT VALUE");
				double amount = sc.nextDouble();
				bk.deposit(amount);
				break;
			case '4':
				System.out.println("ENTER A WITHDRAW VALUE");
				amount = sc.nextDouble();
				bk.withdraw(amount);
				break;
			case '5':
				b = false;
				break;

			default:
				System.out.print("OPTION INVALID:/n");

			}

		} while (b);

		sc.close();

	}

}
