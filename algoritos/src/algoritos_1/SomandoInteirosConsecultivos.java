package algoritos_1;

import java.util.Scanner;

public class SomandoInteirosConsecultivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int n = sc.nextInt();

		/*
		 * for(int i = 3; i <= n - 1; i++) {
		 * 
		 * 
		 * 
		 * }
		 */

		int i = 3;
		
		int soma = 0;

		while (i >= n -1) {

			if (n <= 0) {

				n = sc.nextInt();

			}

			else if (i > 0) {
				a += i;
			}
			soma += i;
			
			i += 1;
		}

		System.out.println(soma);

	}

}
