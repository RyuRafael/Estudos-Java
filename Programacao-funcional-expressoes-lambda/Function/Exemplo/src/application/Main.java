package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Fazer um programa que, a partir de uma lista de produtos, gere uma
nova lista contendo os nomes dos produtos em caixa alta.*/

import entities.Product;
import util.UpperCaseName;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		List<String> l = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		l.forEach(System.out::println);

	}

}