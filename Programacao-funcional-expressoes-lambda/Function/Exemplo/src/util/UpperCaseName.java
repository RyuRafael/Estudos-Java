package util;

import java.util.function.Function;

import entities.Product;

// Function<T, R> tipo de entrada e saida, ex: <Entrada(Classe), Saida(Resultado)>
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		// TODO Auto-generated method stub
		return p.getNome().toUpperCase();
	}

}
