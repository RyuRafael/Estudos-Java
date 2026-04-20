package services;

import java.security.InvalidParameterException;

public interface EmprestimoService {
	
	double getTaxaJuros();
	
	default double payment(double valor, int mes) {

		if (mes < 1) {
			throw new InvalidParameterException("Quantidade de mes não pode ser zero");
		}

		return valor * (Math.pow(1.0 + getTaxaJuros() / 100.0, mes));
	}

}
