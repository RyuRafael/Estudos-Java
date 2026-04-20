package services;

public class UsaTaxaService implements EmprestimoService {
	
	private double taxaJuros;

	public UsaTaxaService(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
}
