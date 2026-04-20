package application;

import java.util.Scanner;

import services.BrasilTaxaServices;
import services.EmprestimoService;

/*Fazer um programa para ler uma quantia e a duração em meses de um
empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
empréstimo, conforme regras de juros do Brasil. A regra de cálculo de
juros do Brasil é juro composto padrão de 2% ao mês.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quant = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		EmprestimoService br = new BrasilTaxaServices(2.0);
		
		double payment = br.payment(quant, meses);
		
		System.out.printf("Pagamento Apos %d meses: %n", meses);
		System.out.printf("%.2f", payment);
	}

}
