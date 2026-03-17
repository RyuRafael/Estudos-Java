package exercicioDeFixacao;

public class PessoaJuridica extends Contribuente {

	private int numeroFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double totalImposto() {

		if (numeroFuncionarios > 10) {
			double total = 14 / 100.0 * getRendaAnual();
			return total;
		} else {
			return 16 / 100.0 * getRendaAnual();
		}
	}
}
