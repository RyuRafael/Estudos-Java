package algoritmosTreinoLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class exercicios {

	// 1° Leia 5 números e armazene em uma lista, depois mostre todos.
	public static void questao1(Scanner sc) {
		List<Double> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o primerio numero " + (i + 1) + "°");
			double numero = sc.nextDouble();
			list.add(numero);
		}

		for (Double n : list) {
			System.out.println(n);
		}
	}

	// 2° Leia 10 nomes e mostre-os em ordem inversa.
	public static void questao2(Scanner sc) {

		List<String> list = new ArrayList<>();
		
		sc.next();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o primerio nome " + (i + 1) + "°");
			String nome = sc.nextLine();
			list.add(nome);

		}

		Collections.reverse(list);

		for (String n : list) {
			System.out.println(n);
		}

	}

	// 3° Leia 5 notas de um aluno e calcule a média.
	public static void questao3(Scanner sc) {

		List<Double> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a primera nota " + (i + 1) + "°");
			double numero = sc.nextDouble();

			list.add(numero);

		}

		double media = 0;

		for (int i = 0; i < 5; i++) {
			media += list.get(i);

		}

		list.removeAll(list);
		list.add(media / 5);

		System.out.println(list.get(0));

	}

	// 4° Leia 10 números e mostre apenas os pares.
	public static void questao4(Scanner sc) {

		List<Double> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite o primero numero " + (i + 1) + "°");
			double numero = sc.nextDouble();

			list.add(numero);
			// list.removeIf(s -> s.doubleValue() % 2 != 0);
		}

		List<Double> result = list.stream().filter(s -> s.doubleValue() % 2 == 0).collect(Collectors.toList());
		for (Double pares : result) {
			System.out.println(pares);
		}
	}

	// 5° Leia 8 números e mostre o maior e o menor
	public static void questao5(Scanner sc) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 8; i++) {

			System.out.println("Digite o primero numero " + (i + 1) + "°");
			int numero = sc.nextInt();

			list.add(numero);

		}

		int maior = Collections.max(list);
		int menor = Collections.min(list);

		System.out.println(maior);
		System.out.println(menor);

	}
	
	//6° Leia uma lista de 10 palavras e mostre apenas as que começam com vogal.
	public static void questao6(Scanner sc) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite um nome " + (i + 1) + "°");
			String palavra = sc.nextLine();

			list.add(palavra);

		}
		
		
		
		List<String> result = list.stream().filter(s -> s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u').collect(Collectors.toList());
		
		for(String vogal: result) {
			System.out.println(vogal);
		}
	}
	
	//Leia 10 números, remova os repetidos e mostre a lista sem duplicatas.
	public static void questao7(Scanner sc) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite o primero numero " + (i + 1) + "°");
			int numero = sc.nextInt();

			list.add(numero);

		}
		
		 //List<Integer> result = list.stream().distinct().collect(Collectors.toList());
		 
		//list = list.stream().distinct().collect(Collectors.toList());
		
		List<Integer> result = new ArrayList<>();
		
		for(Integer r: list) {
			if(!result.contains(r)) {
				result.add(r);
			}
		}
		  
		for(int n: result) {
			System.out.println(n);
		}
	}
	
	//Leia uma lista de nomes e ordene em ordem alfabética.
	public static void questao8(Scanner sc) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite um nome " + (i + 1) + "°");
			String nomes = sc.nextLine();

			list.add(nomes);
		}
		
		list.sort(Comparator.naturalOrder());
		
		for(String nomes: list) {
			System.out.println(nomes);
		}
	}
	//Crie um programa que funcione como uma lista de compras (adicionar itens, remover itens e listar todos).
	public static void questao9(Scanner sc) {
		List<String> frutas = new ArrayList<>();
		List<Double> preco = new ArrayList<>();
		List<Integer> estoque = new ArrayList<>();
		
		frutas.add("banana");
		frutas.add("maçã");
		frutas.add("uva");
		frutas.add("laranja");
		
		preco.add(5.82);
		preco.add(7.12);
		preco.add(10.90);
		preco.add(5.50);
		
		estoque.add(10);
		estoque.add(24);
		estoque.add(14);
		estoque.add(32);
		
		
		boolean controler = true;
		
		do {
			
			System.out.println("---------------MENU---------------");
			System.out.println("");
			System.out.println("1 - adicionar");
			System.out.println("2 - remover");
			System.out.println("3 - listar");
			System.out.println("4 - sair");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite o nome da fruta: ");
					frutas.add(sc.nextLine());
					System.out.println("Digite o preço: ");
					preco.add(sc.nextDouble());
					sc.nextLine();
					System.out.println("Estoque");
					estoque.add(sc.nextInt());
					break;
				case 2:
					frutas.forEach(s -> System.out.println(s));
					
					System.out.println("Digite o nome da fruta para remover");
					sc.nextLine();
					String nome = sc.nextLine();
					
					for(int i = 0; i < frutas.size(); i++) {
						if(frutas.get(i).equals(nome)) {
							frutas.remove(i);
							preco.remove(i);
							estoque.remove(i);
						}
					}
					break;
				case 3:
					IntStream.range(0, frutas.size()).
					forEach(i -> System.out.println(frutas.get(i) + "			|			" + preco.get(i) + "			|			" + estoque.get(i)));
					break;
				case 4:
					System.out.println("Saindo");
					controler = false;
					break;
			}
			
		}while(controler);	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		exercicios ex = new exercicios();

		// questao1(sc);
		// questao2(sc);
		// questao3(sc);
		// questao4(sc);
		// questao5(sc);
		questao6(sc);
		// questao7(sc);
		// questao8(sc);
		//   questao9(sc);

	}

}
