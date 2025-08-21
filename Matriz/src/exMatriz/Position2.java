package exMatriz;

import java.util.Random;
import java.util.Scanner;

public class Position2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Enter the number of lines: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of column: ");
		int m = sc.nextInt();

		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = rand.nextInt(101);

			}
		}

		/*
		 * int[][] matriz = { {1, 2, 3, 4}, {3, 4, 3, 5}, {6, 7, 8, 9} };
		 */

		System.out.println("Enter the line: ");
		int x = sc.nextInt();

		System.out.println("Enter the position: ");
		int y = sc.nextInt();

		if (x >= 0 && x < matriz.length && y >= 0 && y < matriz[x].length) {

			if (y > 0) {
				System.out.println("Left: " + matriz[x][y - 1]);
			}
			if (x > 0) {
				System.out.println("Up: " + matriz[x - 1][y]);
			}
			if (y < matriz[x + 1].length) {
				System.out.println("Right: " + matriz[x][y + 1]);
			}

			if (x < matriz.length) {

				System.out.println("Down: " + matriz[x + 1][y]);

			}

		}

		for (int i = 0; i < matriz.length; i++) {

			System.out.println();

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");

			}
		}
	}

}
