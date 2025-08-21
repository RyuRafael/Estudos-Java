package algoritos_1;

import java.util.Scanner;



/*
 * beecrowd | 1134
 * 
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido(codificado da seguinte forma:1. Álcool 2. Gasolina 3.D iesel 4.F im).
Caso o usuário informe um código inválido(fora da faixa de 1 a 4)deve ser solicitado um novo código(até que seja válido).O programa será encerrado quando o código informado for o número 4.*/

public class TipoDeCombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int g = 0;
		int d = 0;

		boolean b = true;

		while (b) {

			int opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				a++;
				break;
			case 2:
				g++;
				break;
			case 3:
				d++;
				break;
			case 4:
				b = false;
				break;
			default:
				continue;

			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);

	}

}
