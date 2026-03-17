package Funcionarios;

public class FuncionarioTercerizado extends Funcionario{
	
	private double adicional;

	
	public FuncionarioTercerizado(String nome, int horas, double valorHora, double adicional) {
		super(nome, horas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	@Override
	public double pagamento() {
		double adi = 110.0/100 * adicional; 
		return getHoras() * getValorHora() + adi;
	}
}
