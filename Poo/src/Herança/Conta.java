package Herança;

public class Conta {
	
	private Integer nunber;
	private String holder;
	protected double balance;
	
	
	public Conta(Integer nunber, String holder, double balance) {
		this.nunber = nunber;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNunber() {
		return nunber;
	}

	public void setNunber(Integer nunber) {
		this.nunber = nunber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//saque
	public void withDraw(double amount) {
		if( amount < balance) {
			this.balance -= amount + 5.0;
			System.out.println("saque realizado com sucesso!");
		}
		else {
			System.out.println("falha ao realizar saque");
		}
	}
	
	public void deposit(double amount) {
		if(amount >0) {
			this.balance += amount;
			System.out.println("Deposito realizado com sucesso!");
		}
		else {
			System.out.println("Saldo inválido");
		}
	}

}
