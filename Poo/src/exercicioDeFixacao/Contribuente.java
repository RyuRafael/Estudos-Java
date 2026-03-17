package exercicioDeFixacao;

public abstract class Contribuente {

	private String nome;
	private double rendaAnual;

	public Contribuente() {
	}

	public Contribuente(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract double totalImposto();
}
