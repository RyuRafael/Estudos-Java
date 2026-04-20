package services;

import java.security.InvalidParameterException;

public class BrasilTaxaServices implements EmprestimoService{

	private double taxaJuros;

	public BrasilTaxaServices(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double payment(double valor, int mes) {

		if (mes < 1) {
			throw new InvalidParameterException("Quantidade de mes não pode ser zero");
		}

		return valor * (Math.pow(1.0 + taxaJuros / 100.0, mes));
	}

}
