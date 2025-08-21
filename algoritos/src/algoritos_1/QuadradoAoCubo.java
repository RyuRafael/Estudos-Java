package algoritos_1;

import java.util.Scanner;

public class QuadradoAoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int x = 1;
		int y = 1;
		int somax = 0;
		int somay = 1;

		for (int i = 1; i <= n; i++) {

			System.out.printf("%d %d %d%n", i, x, y);

			for (int j = 0; j < 1; j++) {

				x += 1;
				y += 1;

				System.out.printf("%d %d %d%n", i, x, y);

			}

			somax += 2;
			somay += 1;

			x += somax;

			y = somay * x;

		}

		sc.close();
	}

}
