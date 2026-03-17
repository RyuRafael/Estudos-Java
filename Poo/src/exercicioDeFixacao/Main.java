package exercicioDeFixacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Contribuente> contribuentes = new ArrayList<>();

		System.out.print("Digite o número de contribuentes: ");
		int numContribuentes = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numContribuentes; i++) {
			System.out.println("Contribuente #" + i);
			System.out.print("Pessoa física ou jurídica(f/j): ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			sc.nextLine();

			if (tipo == 'f') {
				System.out.print("Gastos com saúde: ");
				double gasto = sc.nextDouble();

				contribuentes.add(new PessoaFisica(nome, renda, gasto));
			} else {
				System.out.print("Número de funcionários: ");
				int quantFuncionarios = sc.nextInt();
				sc.nextLine();

				contribuentes.add(new PessoaJuridica(nome, renda, quantFuncionarios));
			}
		}

		System.out.println("Impostos pagos:\n");
		double totalPago = 0.00;

		for (Contribuente con : contribuentes) {
			totalPago += con.totalImposto();
			System.out.println(String.format("%.2f", con.totalImposto()));
		}

		System.out.println("\ntotal de impostos: $ " + String.format("%.2f", totalPago));
	}
}
