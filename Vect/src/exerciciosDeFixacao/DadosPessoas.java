package exerciciosDeFixacao;

import java.util.Scanner;

//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens

public class DadosPessoas {

	private double altura;
	private char genero;

	public DadosPessoas(double altura, char genero) {
		super();
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public char getGenero() {
		return genero;
	}

	public static double maiorAltura(DadosPessoas[] pessoa) {
		double maior = Double.MIN_VALUE;

		for (DadosPessoas p : pessoa) {

			if (p.getAltura() > maior) {
				maior = p.getAltura();
			}

		}
		return maior;
	}

	public static double menorAltura(DadosPessoas[] pessoa) {
		double menor = Double.MAX_VALUE;

		for (DadosPessoas p : pessoa) {

			if (p.getAltura() < menor) {

				menor = p.getAltura();
			}

		}
		return menor;
	}

	public static Double mediaAlturaMulher(DadosPessoas[] pessoa) {
		double soma = 0;
		int numMulher = 0;

		for (DadosPessoas p : pessoa) {
			if (p.getGenero() == 'F' || p.getGenero() == 'f') {
				soma += p.altura;
				numMulher++;
			}
		}
		return soma / numMulher;
	}

	public static int contarHomens(DadosPessoas[] pessoa) {
		int numHomem = 0;

		for (DadosPessoas p : pessoa) {
			if (p.getGenero() == 'M' || p.getGenero() == 'm') {
				numHomem++;
			}
		}
		return numHomem;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de pessoas? ");
		int n = sc.nextInt();

		DadosPessoas[] pessoa = new DadosPessoas[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite a altura da pessoa #" + (i + 1) + " ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Digite genero da pessoa #" + (i + 1) + " ");
			char genero = sc.next().charAt(0);

			pessoa[i] = new DadosPessoas(altura, genero);

		}

		System.out.println("Menor altura = " + menorAltura(pessoa));
		System.out.println("Maior altura = " + maiorAltura(pessoa));
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAlturaMulher(pessoa)));
		System.out.println("Numero de homens = " + contarHomens(pessoa));

		sc.close();

	}

}
