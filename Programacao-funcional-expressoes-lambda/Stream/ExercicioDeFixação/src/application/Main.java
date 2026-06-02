package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

/*Fazer um programa para ler os dados (nome, email e salário)
de funcionários a partir de um arquivo em formato .csv.
Em seguida mostrar, em ordem alfabética, o email dos
funcionários cujo salário seja superior a um dado valor
fornecido pelo usuário.
Mostrar também a soma dos salários dos funcionários cujo
nome começa com a letra 'M'.
Veja exemplo na próxima página.*/

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String path = "/home/rafael/Estudos-Java/Programacao-funcional-expressoes-lambda/Stream/ExercicioDeFixação/src/util/funcionario.csv";

		System.out.print("Digite o salário: ");
		double salario = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Funcionario> list = new ArrayList<>();

			String line = br.readLine();
			// Ler o arquivo e criar funcionarios
			while (line != null) {

				String[] valor = line.split(",");
				list.add(new Funcionario(valor[0], valor[1], Double.parseDouble(valor[2])));

				line = br.readLine();
			}

			List<String> salarioSuperior = list.stream().filter(f -> f.getSalario() > salario).map(f -> f.getEmail())
					.sorted().toList();

			// Soma de todos os salarios em que o nome começa com M
			double somaSalarioM = list.stream().filter(f -> f.getNome().charAt(0) == 'M')
					.mapToDouble(Funcionario::getSalario).sum();

			System.out.println("Email de pessoar com salário mairo que " + salario);

			salarioSuperior.forEach(System.out::println);

			System.out.println(
					"Soma do salário das pessoa que o nome começa com M: " + String.format("%.2f", somaSalarioM));

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
