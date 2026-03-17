package Herança;

public class ContaPoupanca extends Conta {
	
	private double juros;

	public ContaPoupanca(Integer nunber, String holder, double balance, double juros) {
		super(nunber, holder, balance);
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	
	public void atualizarSaldo() {
		balance += balance * juros;
	}
	
	@Override
	public void withDraw(double amount) {
		if( amount < balance) {
			this.balance -= amount;
			System.out.println("saque realizado com sucesso!");
		}
		else {
			System.out.println("falha ao realizar saque");
		}
	}
	

}
