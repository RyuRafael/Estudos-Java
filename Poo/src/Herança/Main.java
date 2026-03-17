package Herança;import java.text.Format;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1121, "Rafael", 793.00);
		ContaPj contaPj = new ContaPj(24243, "Mario", 4712.00, 1000);
		Conta cp = new ContaPoupanca(1212, "Paulo", 300, 0.1);
		
		
		//UPCASTING
		
		Conta c1 = cp;
		Conta c2 = new ContaPj(3218, "Marcelo", 554.5, 222);
		Conta c3 = new ContaPoupanca(2323, "Pedro", 121, 0.1);
		
		
		//DOWNCASTING
		
		ContaPj cp1 = (ContaPj) c2;
	
//		.............................................................
		
		
		
		conta.deposit(1000);
		System.out.println(conta.getBalance());

		conta.withDraw(793);
		System.out.println(conta.getBalance());
		
		contaPj.deposit(1000);
		System.out.println(contaPj.getBalance());		
		contaPj.withDraw(4712);
		System.out.println(contaPj.getBalance());
		
		contaPj.emprestimo(1000);
		System.out.println(contaPj.getBalance());
		
		contaPj.emprestimo(97);
		System.out.println(contaPj.getBalance());
		
		cp.withDraw(200);
		System.out.println(cp.getBalance());
	}

}
