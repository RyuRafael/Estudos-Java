package Employee;

/*azer um programa para ler um número inteiro N e depois os 
dados (id, nome e salario) de N funcionários. Não deve haver 
repetição de id. 
 
Em seguida, efetuar o aumento de X por cento no salário de 
um determinado funcionário. Para isso, o programa deve ler 
um id e o valor X. Se o id informado não existir, mostrar 
uma mensagem e abortar a operação. Ao final, mostrar a 
listagem atualizada dos funcionários, conforme exemplos.
 
Lembre-se de aplicar a técnica de encapsulamento para não 
permitir que o salário possa ser mudado livremente. Um 
salário só pode ser aumentado com base em uma operação 
de aumento por porcentagem dada.*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Enter the number of employee");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("NAME: ");
			String name = sc.nextLine();
			System.out.println("SALARY: ");
			double salary = sc.nextDouble();

			if (employee.listId.indexOf(id) == -1) {

				employee.listId.add(id);
				while (employee.listName.size() <= id) {
					employee.listName.add(null);
					employee.listSalary.add(null);
				}
				employee.listName.add(id, name);
				employee.listSalary.add(id, salary);
			} else {
				System.out.println("that id already exists! ");
			}
		}

		System.out.println("Enter the employee id that will have salary encrease: ");
		int id = sc.nextInt();
		sc.nextLine();

		int index = employee.listId.indexOf(id);

		if (index != -1) {
			System.out.println("Enter the percentage:");
			double percentage = sc.nextDouble();
			employee.setId(id);
			employee.increaseSalary(percentage);
		}

		else {
			System.out.println("This id does not exist!\n ");
		}

		employee.notnullList();
		System.out.println("List of employee:\n");

		for (int i = 0; i < employee.listId.size(); i++) {

			System.out.printf("%d, %s, %.2f%n", employee.listId.get(i), employee.listName.get(i),
					employee.listSalary.get(i));
		}

		sc.close();
	}
}
