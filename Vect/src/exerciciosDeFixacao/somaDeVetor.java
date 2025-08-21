package exerciciosDeFixacao;
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Scanner;

public class somaDeVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		double soma = 0;
		
		
		for(int i = 0; i < vetor.length; i++) {
			
			n = sc.nextInt();
			vetor[i] = n;
			
			soma += vetor[i];
		}

		System.out.print("VALORES = ");
		for(int v : vetor) {
			System.out.printf("%.2f ", (double)v);
		}
		
		
		double media = soma / n;
		System.out.printf("%nSOMA = %.2f", soma);
		System.out.printf("MEDIA = %.2f",  media);
		
		sc.close();

	}

}
