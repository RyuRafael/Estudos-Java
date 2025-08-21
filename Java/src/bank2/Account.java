package bank2;

public class Account {
	
	
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		
		this.holder = holder;
		this.number = number;
	}
	
	public void deposit(double amount) {
		
		
		this.balance += amount;
		
	}
	
	public void withdraw(double amount) {
		
		this.balance -= amount + 5;
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account: "
				+ number
				+ ", Holder: "
				+ holder 
				+ ", Balance: "
				+ String.format("%.2f", balance);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public double gerBalance() {
		return balance;
	}

}
