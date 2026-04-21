package application;

import java.util.Scanner;

import services.PrintServices;

/*Deseja-se fazer um programa que leia uma quantidade N, e depois N números
inteiros. Ao final, imprima esses números de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintServices ps = new PrintServices();

		System.out.print("Digite a quantidade de números: ");
		int quant = sc.nextInt();

		for (int i = 1; i <= quant; i++) {
			System.out.print("Digite o número #" + i + ": ");
			Object numero = sc.next();
			ps.listAdd(numero);

		}
		
		ps.print();
		System.out.println("\nPrimeiro número: " + ps.primeiroNumero());

	}

}
