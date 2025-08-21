package funcionario;

import java.util.Scanner;

public class Manager extends Employee {

	Manager(String name, double salary, String position) {
		super(name, 0, position);
	}

	@Override
	public void setInformation(Scanner sc) {
		// o gerente nao tem taxa

		if (getName() == "Employee") {

			System.out.println("Enter with the name of manager: ");

			setName(sc.nextLine());
		}

		System.out.println("Enter with the grossSalary");

		double recive = sc.nextDouble();
		recive += getSalary();

		setSalary(recive);
		sc.nextLine();

	}

	@Override
	public void IncreaseSalary(double porcento) {
		// tem mais 50% do salario
		super.IncreaseSalary(porcento);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void depositBank(Bank bank, double amount) {

		if (getSalary() > amount) {

			double total = getSalary() - amount;
			setSalary(total);

			bank.deposit(amount);

			System.out.println("deposited successfully");
		}

		else {
			System.out.println("dont's balance");
		}
	}
}
