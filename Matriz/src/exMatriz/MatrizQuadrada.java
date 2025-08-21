package exMatriz;

import java.util.Scanner;

public class MatrizQuadrada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 1;

		do {

			int n = sc.nextInt();
			if (n > 0 && n < 100) {
				int[][] matriz = new int[n][n];

				for (int i = 0; i < n; i++) {
					System.out.println();
					for (int j = 0; j < matriz[i].length; j++) {

						matriz[i][j] = j;

					}
				}
			}

		} while (cont != 0);

	}

}
