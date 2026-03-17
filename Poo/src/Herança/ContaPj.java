package Herança;

public class ContaPj extends Conta{
	
	private double limiteCredito;

	public ContaPj(Integer nunber, String holder, double balance, double limiteCredito) {
		super(nunber, holder, balance);
		this.limiteCredito = limiteCredito;
		// TODO Auto-generated constructor stub
	}

	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
		
	}
	
	public void emprestimo(double amount) {
		if(amount <= limiteCredito) {
			 this.limiteCredito -= amount;
			 
			 deposit(amount);
		}
		else {
			System.out.println("Valor inválido");
		}
	}
	
}
