package application;

import java.util.Scanner;

import entities.Conta;
import exceptions.ExceptionConta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do titular: ");
		String titular = sc.nextLine();
		System.out.print("Digite o saldo da conta: ");
		double saldo = sc.nextDouble();
		System.out.print("Digite o limite de saque: ");
		double limite = sc.nextDouble();
		
		Conta conta = new Conta(numero, titular, saldo, limite);
		
		
		
		System.out.print("\nDigito o valor que deseja sacar: ");
		double valorSaque = sc.nextDouble();
		
		try {
		conta.saque(valorSaque);
		System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
		}
		catch (ExceptionConta e) {
			System.out.println(e.getMessage());
		}
	}

}
