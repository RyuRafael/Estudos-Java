package services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ContratoSercives {

	private PagamentoServices pagamentoServices;

	public ContratoSercives(PagamentoServices pagamentoServices) {

		this.pagamentoServices = pagamentoServices;
	}

	public void contrato(Contrato contrato, int TotalParcelas, int parcelaAtual) {

		double valorParcelado = contrato.getValorTotal() / TotalParcelas;

		LocalDate dataVencimento = contrato.getDataContrato().plusMonths(parcelaAtual);

		double juroMes = pagamentoServices.jurosMensais(valorParcelado, parcelaAtual);
		double total = pagamentoServices.taxaDePagamento(juroMes + valorParcelado);

		contrato.setParcela(new Parcela(dataVencimento, total));
	}
}
