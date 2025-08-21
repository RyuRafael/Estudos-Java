package exercicio_fixacao;

import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int n = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int m = sc.nextInt();

		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		int[][] C = new int[n][m];

		System.out.println("Digite o numero da primeira matriz: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite o numero da segunda matriz: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				System.out.print(C[i][j] + " ");
			}
		}
		sc.close();

	}

}
