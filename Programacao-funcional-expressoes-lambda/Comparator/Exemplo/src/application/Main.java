package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//list.sort(new MyComparator());
		
		// Classe anonima para comparar o produto sem precissar implemenatar a interface em outra classe
		/*Comparator<Product> comp1 = new Comparator<Product>() {
			
			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
		};
		
		list.sort(comp1);
		*/
		
		// Utiliza a expressão lambda para reduzir a classe anonima comp1, cria uma função reduzida
		
//		Comparator<Product> comp2 = (p1,p2) -> {
//			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
//		};
		
		//Comparator<Product> comp2 = (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		
		// Posso simplesmente colocar a expressão lambda direto na função
		list.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		for (Product product : list) {
			System.out.println(product);
		}

	}

}
