package model.entities;

public class Fatura {

	private double valorPagamento;
	private double imposto;
	private double PagamentoTotal;

	public Fatura(double valorPagamento, double imposto) {
		this.valorPagamento = valorPagamento;
		this.imposto = imposto;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getPagamentoTotal() {
		return valorPagamento + imposto;
	}

	public void setPagamentoTotal(double pagamentoTotal) {
		PagamentoTotal = pagamentoTotal;
	}

}
