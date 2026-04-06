package model.entities;

import java.time.LocalDate;

public class Parcela {
	
	private LocalDate dataPagamento;
	private double valor;
	
	public Parcela(LocalDate dataPagamento, double valor) {
		this.dataPagamento = dataPagamento;
		this.valor = valor;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Parcela [dataPagamento=" + dataPagamento + ", valor=" + valor + "]";
	}
	
	

}
