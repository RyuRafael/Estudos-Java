package Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Digite o número de funcionários: ");
		int numFuncionario = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= numFuncionario; i++) {
			System.out.println("Funcionário #" + i);
			
			System.out.print("Funcionário tercerizado?(S/N): ");
			char tercerizado = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valor = sc.nextDouble();
			
			
			if(Character.toUpperCase(tercerizado) == 'S') {
				System.out.print("adicional: ");
				double adicional = sc.nextDouble();
				
				Funcionario funcionarioTercerizado = new FuncionarioTercerizado(nome, horas, valor, adicional);
				funcionarios.add(funcionarioTercerizado);
			}
			
			else {
				Funcionario funcionario = new Funcionario(nome,horas,valor);
				funcionarios.add(funcionario);
			}
		}
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

	}

}
