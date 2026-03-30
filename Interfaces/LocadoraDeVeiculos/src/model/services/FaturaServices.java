package model.services;

import java.time.Duration;

import model.entities.Fatura;
import model.entities.Locadora;

public class FaturaServices {

	private double valorPorHora;
	private double valorPorDia;

	private ImpostoServices impostoServices;

	public FaturaServices(double valorPorHora, double valorPorDia, ImpostoServices impostoServices) {
		this.valorPorHora = valorPorHora;
		this.valorPorDia = valorPorDia;
		this.impostoServices = impostoServices;
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

	public ImpostoServices getImpostoService() {
		return impostoServices;
	}

	public void setImpostoService(ImpostoServices impostoService) {
		this.impostoServices = impostoService;
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
		
		double totalImposto = impostoServices.calcularImposto(pagamento);

		locadora.setFatura(new Fatura(pagamento, totalImposto));
	}

}
