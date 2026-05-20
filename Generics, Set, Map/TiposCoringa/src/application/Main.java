package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	// Tipos coringa, aceita qualquer tipo de valor;
	// podemos fazer métodos que recebem um genérico de "qualquer tipo"
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		List<String> nomes = Arrays.asList("Ana", "Bob", "Paulo");
		
		printList(numeros);
		printList(nomes);

	}

}
