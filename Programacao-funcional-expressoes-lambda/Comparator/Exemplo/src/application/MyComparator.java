package application;

import java.util.Comparator;

import entities.Product;

// Classe que implementa a interface para ordenar o produto
public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}

}
