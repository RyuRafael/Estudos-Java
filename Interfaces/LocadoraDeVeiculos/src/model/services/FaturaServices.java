package model.services;

import java.time.Duration;

import model.entities.Fatura;
import model.entities.Locadora;

public class FaturaServices {

	private double valorPorHora;
	private double valorPorDia;

	private ImpostoService impostoService;

	public FaturaServices(double valorPorHora, double valorPorDia, ImpostoService impostoService) {
		this.valorPorHora = valorPorHora;
		this.valorPorDia = valorPorDia;
		this.impostoService = impostoService;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public double getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(double valorPorDia) {
		this.valorPorDia = valorPorDia;
	}

	public ImpostoService getImpostoService() {
		return impostoService;
	}

	public void setImpostoService(ImpostoService impostoService) {
		this.impostoService = impostoService;
	}

	public void gerarFatura(Locadora locadora) {

		long minutos = Duration.between(locadora.getInicio(), locadora.getFim()).toMinutes();
		double hora = minutos / 60.0;

		double pagamento;
		if (hora <= 12) {
			pagamento = valorPorHora * Math.ceil(hora);
		} else {
			pagamento = valorPorDia * Math.ceil(hora / 24);
		}
		
		double totalImposto = impostoService.calcularImposto(pagamento);

		locadora.setFatura(new Fatura(pagamento, totalImposto));
	}

}
