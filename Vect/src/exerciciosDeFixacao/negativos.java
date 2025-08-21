package exerciciosDeFixacao;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos

import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro entre  1 e 10: ");
		int n = sc.nextInt();

		int cont = 0;

		while (n < 1 || n > 10) {
			System.out.println("Digite um numero inteiro entre  1 e 10: ");
			n = sc.nextInt();
		}

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			n = sc.nextInt();

			vetor[i] = n;
		}

		for (int v : vetor) {
			if (v < 0) {
				System.out.println(v);

			}
		}

		sc.close();

	}

}
