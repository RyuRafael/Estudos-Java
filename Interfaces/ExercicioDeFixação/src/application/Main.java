package application;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contrato;
import services.ContratoSercives;
import services.PayPalServices;

/*Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
número de meses desejado.
A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
e valor total do contrato). Em seguida, o programa deve ler o número de meses para
parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.*/

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
