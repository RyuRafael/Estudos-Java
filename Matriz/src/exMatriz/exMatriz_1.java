package exMatriz;

import java.util.Scanner;

public class exMatriz_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int n = sc.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Line #" + (i + 1 + "\n"));

			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Number #" + (j + 1));
				matriz[i][j] = sc.nextInt();
			}
		}

		int negativeNum = 0;
		System.out.print("Main diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");

			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {

					negativeNum++;
				}

			}
		}

		System.out.println("\nNegative numbers = " + negativeNum);

		sc.close();
	}

}
