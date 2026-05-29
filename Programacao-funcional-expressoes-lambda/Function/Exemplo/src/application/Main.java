package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Fazer um programa que, a partir de uma lista de produtos, gere uma
nova lista contendo os nomes dos produtos em caixa alta.*/

import entities.Product;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// Interface
		// List<String> listName = list.stream().map(new
		// UpperCaseName()).collect(Collectors.toList());

		// Método Static
		//List<String> listName = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		// Método normal
		//List<String> listName = list.stream().map(Product::upperCaseName).collect(Collectors.toList());
		
		// Expressão declarada
		Function<Product, String> func = p -> p.getNome().toUpperCase();
		List<String> listName = list.stream().map(func).collect(Collectors.toList());

		listName.forEach(System.out::println);

	}

}