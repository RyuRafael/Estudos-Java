package exercicio_fixacao;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int n = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int m = sc.nextInt();

		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Linha " + (i + 1));
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o numero: " + (j + 1) + " ");
				matriz[i][j] = sc.nextInt();
			}
		}

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				} else if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}

		System.out.println("MAIOR: " + maior);
		System.out.println("MENOR: " + menor);

		sc.close();

	}
}
