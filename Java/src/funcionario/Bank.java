package funcionario;

import java.util.Scanner;

public class Bank {

	private double balance;

	public void deposit(Double amount) {

		balance += amount;

	}

	public void withdraw(Employee employee, double amount) {

		if (amount <= balance) {

			balance -= amount;

			double total = employee.getSalary() + amount;

			employee.setSalary(total);

			System.out.println("withdraw successfully!");

		}

		else {

			System.out.println("dont's balance");

		}

	}

	public void withdraw(Manager manager, double amount) {

		if (amount <= balance) {

			balance -= amount;

			double total = manager.getSalary() + amount;

			manager.setSalary(total);

			System.out.println("withdraw successfully!");

		}

		else {

			System.out.println("dont's balance");

		}

	}

	public void handleBankOperations(Scanner sc, Employee employee, Bank bk) {

		boolean b = true;

		do {
			System.out.println("1 - to deposit:");
			System.out.println("2 - to withdraw:");
			System.out.println("3 - print balance:\n");
			System.out.println("4 - exit:\n");

			char op = sc.next().charAt(0);

			sc.nextLine();

			switch (op) {
			case '1':
				System.out.println("amount the deposit:");
				double deposit = sc.nextDouble();
				employee.depositBank(bk, deposit);
				break;

			case '2':

				System.out.println("amount the withdraw:");
				double withDraw = sc.nextDouble();

				bk.withdraw(employee, withDraw);
				break;

			case '3':

				System.out.println(bk);
				break;

			case '4':
				b = false;
				System.out.println("leaving!");
				break;

			default:
				System.out.println("invalid option");

			}
		} while (b);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BALANCE: " + balance;
	}

}
