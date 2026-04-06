package services;

public interface PagamentoServices {

	public double taxaDePagamento(double valor);
	public double jurosMensais(double valor, int mes);
	
}
