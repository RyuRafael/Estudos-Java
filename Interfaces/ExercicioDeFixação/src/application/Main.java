package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contrato;
import services.ContratoSercives;
import services.PayPalServices;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		int parcela = sc.nextInt();

		Contrato contrato = new Contrato(numero, data, valor);
		ContratoSercives cs = new ContratoSercives(new PayPalServices());

		for (int i = 1; i <= parcela; i++) {
			cs.contrato(contrato, parcela, i);
			System.out.println(contrato.getParcela().getDataPagamento().format(dtf) + " - "
					+ String.format("%.2f", contrato.getParcela().getValor()));
		}

		sc.close();

	}

}
