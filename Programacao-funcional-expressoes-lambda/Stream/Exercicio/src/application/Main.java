package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

/*Fazer um programa para ler um conjunto de produtos a partir de um
arquivo em formato .csv (suponha que exista pelo menos um produto).
Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
nomes, em ordem decrescente, dos produtos que possuem preço
inferior ao preço médio.*/

public class Main {

	public static void main(String[] args) {

		String path = "/home/rafael/Estudos-Java/Programacao-funcional-expressoes-lambda/Stream/Exercicio/src/util/produtos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] valor = line.split(",");

				list.add(new Product(valor[0], Double.parseDouble(valor[1].trim())));

				line = br.readLine();
			}

			double avg = list.stream().mapToDouble(Product::getPreco).average().orElse(0.0);
			// Sem método
			// double avg2 = list.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x +
			// y) / 2;

			System.out.println("Preço médio: " + String.format("%.2f", avg));

			// Ordem decrecente utilizando o comparator
			/*
			 * Comparator<String> comp = (s1,s2) ->
			 * s1.toUpperCase().compareTo(s2.toUpperCase()); List<String> precoMenor =
			 * list.stream() .filter(p -> p.getPreco() < avg) .map(product ->
			 * product.getNome()).sorted(comp.reversed()).toList();
			 */

			List<String> precoMenor = list.stream().filter(p -> p.getPreco() < avg).map(product -> product.getNome())
					.collect(Collectors.toList());

			// Ordenar lista
			Collections.sort(precoMenor, Collections.reverseOrder());

			precoMenor.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
