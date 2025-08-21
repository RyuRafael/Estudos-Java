package bank;

import java.util.Scanner;

public class BankAccount {

	private String name;
	private final int account;
	private double balance;

	BankAccount(String name, int account, double balance) {

		this.name = name;
		this.account = account;
		this.balance = balance;

	}

	public void setName(String name) {

		this.name = name;

		System.out.println("UPDATE DATE:");
		System.out.printf("ACCOUNT: %d, HOLDER: %s, BALANCE: $ %.2f%n", account, name, balance);

	}

	public void deposit(double amount) {

		

		this.balance += amount;
		System.out.println("UPDATE DATE:");
		System.out.printf("ACCOUNT: %d, HOLDER: %s, BALANCE: $ %.2f%n", account, name, balance);

	}

	public void withdraw(double amount) {

		this.balance -= amount + 5.0;
		System.out.println("UPDATE DATE:");
		System.out.printf("ACCOUNT: %d, HOLDER: %s, BALANCE: $ %.2f%n", account, name, balance);
	}

	@Override
	public String toString() {
		return "ACCOUNT: " + account
				+" HOLDER: " + name
				+" BALANCE: " + balance ;
	}

}


