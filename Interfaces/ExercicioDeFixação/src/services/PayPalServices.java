package services;

public class PayPalServices implements PagamentoServices{
	
	private double taxa = 0.02;
	private double juros = 0.01;

	@Override
	public double taxaDePagamento(double valor) {
		// TODO Auto-generated method stub
		return valor * taxa + valor;
	}

	@Override
	public double jurosMensais(double valor, int mes) {
		// TODO Auto-generated method stub
		return valor * juros * mes;
	}

}
