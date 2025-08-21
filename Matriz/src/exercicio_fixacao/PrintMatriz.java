package exercicio_fixacao;

import java.util.Scanner;

public class PrintMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int n = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int m = sc.nextInt();

		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Linha " + (i+1));
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o numero: " + (j + 1) + " ");
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

		sc.close();

	}

}
