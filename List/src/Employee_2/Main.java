package Employee_2;

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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employee");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			while (hasid(list, id)) {
				System.out.println("Id already taken! Try again:");

				id = sc.nextInt();
			}

			sc.nextLine();
			System.out.println("NAME: ");
			String name = sc.nextLine();
			System.out.println("SALARY: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		System.out.println("Enter the employee id that will have increased: ");
		int idSalary = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findAny().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist! \n");
		}

		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);

		}
		System.out.println("");
		System.out.println("List of employee:\n");

		for (Employee empl : list) {

			//System.out.printf("%d, %s, %.2f%n", e.getId(), e.getName(), e.getSalary());
			System.out.println(empl);

		}
				sc.close();
	}
//	  public static Integer position(List<Employee> list, int id) { for (int i = 0;
//	  i < list.size(); i++) { if (list.get(i).getId() == id) { return i; } } return
//	  null; }

	private static boolean hasid(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findAny().orElse(null);

		return emp != null;
	}
}
