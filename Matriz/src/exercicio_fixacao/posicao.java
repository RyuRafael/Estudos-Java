package exercicio_fixacao;

import java.util.Scanner;

/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.*/

public class posicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de linha da matriz: ");
		int n = sc.nextInt();

		System.out.println("Digite a quantidade de colunas da matriz: ");
		int m = sc.nextInt();

		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Linha #" + (i + 1));

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Posiçao #" + (j + 1));
				matriz[i][j] = sc.nextInt();

			}
		}

		System.out.println("Digite um numero inteiro que pertence a matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Posiçao " + i + "," + j + "\n");

					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);

					}
					if (i > 0) {
						System.out.println("Up :" + matriz[i - 1][j]);

					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);

					}
					if (i + 1 < matriz.length) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}

				}
			}
		}

		sc.close();
	}

}
