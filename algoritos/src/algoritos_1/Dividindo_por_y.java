package algoritos_1;

import java.util.Scanner;
//Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
//Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

public class Dividindo_por_y {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x, y;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			x = sc.nextDouble();
			y = sc.nextDouble();

			if (y == 0) {

				System.out.println("divisao impossivel");

			} else {
				double div = x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();

	}

}
