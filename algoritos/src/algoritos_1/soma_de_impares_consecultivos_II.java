package algoritos_1;

import java.util.Scanner;

public class soma_de_impares_consecultivos_II {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int soma = 0;
			
			if(x > y) {
				int z = x;
				x = y;
				y = z;
			}

			for (int j = x + 1; j < y; j++) {
				if (j % 2 != 0) {
					soma += j;
					
				} 

			}
			
			System.out.println(soma);

		}
	}

}
