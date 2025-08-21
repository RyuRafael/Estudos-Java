package funcionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;

		Employee fc = new Employee("Employee", 0, "Box");

		Manager mg = new Manager("Employee", 0, "Manager");

		Bank bk = new Bank();

		do {

			System.out.println("\n1 - to receive salary employee:");
			System.out.println("2 - print information employee:");
			System.out.println("3 - bank operations employee:");

			System.out.println("4 - to receive salary manager:");
			System.out.println("5 - print information employee:");
			System.out.println("6 - bank operations manager:\n");

			System.out.println("7 - Exit:\n");

			System.out.println("enter option:");
			char op = sc.next().charAt(0);
			sc.nextLine();

			switch (op) {

			case '1':
				System.out.println("increase in salary to employee? ");
				double Percentage = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter with information of employee: \n");
				fc.setInformation(sc);

				fc.NetSalary();

				fc.IncreaseSalary(Percentage);
				break;

			case '2':
				System.out.println(fc);
				break;

			case '3':
				bk.handleBankOperations(sc, fc, bk);
				break;

			case '4':
				System.out.println("Enter with information of manager: \n");
				mg.setInformation(sc);
				mg.IncreaseSalary(50);
				break;

			case '5':

				System.out.println(mg);
				break;

			case '6':
				bk.handleBankOperations(sc, mg, bk);
				break;

			case '7':
				b = false;
				break;

			default:
				System.out.println("\nInvalid option:\n");
				break;

			}

		} while (b);

		sc.close();

	}

}
