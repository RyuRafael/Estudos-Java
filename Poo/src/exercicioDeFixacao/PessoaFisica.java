package exercicioDeFixacao;

public class PessoaFisica extends Contribuente {

	private double gastoSaude;

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double totalImposto() {

		if (getRendaAnual() < 20000) {
			return 15 / 100.0 * getRendaAnual();
		} else {
			return 25 / 100.0 * getRendaAnual() - (gastoSaude / 2);
		}
	}
}
