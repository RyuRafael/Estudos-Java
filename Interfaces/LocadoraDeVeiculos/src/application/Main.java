package application;

/*Uma locadora brasileira de carros cobra um valor por hora para locações de até
12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
cobrada com base em um valor diário. Além do valor da locação, é acrescido no
preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação. O programa
deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os
exemplos.*/

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Locadora;
import model.entities.Veiculo;
import model.services.BrasilImpostoServices;
import model.services.FaturaServices;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada: ");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno: ");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), dtf);
		
		System.out.print("Entre com o preço por hora: ");
		double valorPorHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double valorPorDia = sc.nextDouble();
		
		Locadora locadora = new Locadora(retirada, retorno, new Veiculo(modelo));
		FaturaServices fs = new FaturaServices(valorPorHora, valorPorDia, new BrasilImpostoServices());
		fs.gerarFatura(locadora);
		
		System.out.println("Fatura");
		System.out.println("Pagamento basico: " + String.format("%.2f", locadora.getFatura().getValorPagamento()));
		System.out.println("Imposto: " + String.format("%.2f", locadora.getFatura().getImposto()) );
		System.out.println("Pagamento Total: " + String.format("%.2f", locadora.getFatura().getPagamentoTotal()));
	}
}
