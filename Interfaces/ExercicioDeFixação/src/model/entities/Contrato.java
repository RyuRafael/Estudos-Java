package model.entities;

import java.time.LocalDate;

public class Contrato {
	
	private int numero;
	private LocalDate dataContrato;
	private double valorTotal;
	
	private Parcela parcela;

	public Contrato(int numero, LocalDate dataContrato, double valorTotal) {
		super();
		this.numero = numero;
		this.dataContrato = dataContrato;
		this.valorTotal = valorTotal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}
	
}
