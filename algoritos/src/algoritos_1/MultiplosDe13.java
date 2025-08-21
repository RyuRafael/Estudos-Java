package algoritos_1;

import java.util.Scanner;

/*
 * beecrowd | 1132

Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.
Entrada

O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
*/

public class MultiplosDe13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;

		if (x > y) {
			int troca = y;

			y = x;
			x = troca;
		}

		for (int i = x; i <= y; i++) {

			if (i % 13 != 0) {

				soma += i;

			}

		}

		System.out.println(soma);

		sc.close();

	}

}
