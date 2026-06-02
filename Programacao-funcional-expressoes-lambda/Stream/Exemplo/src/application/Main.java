package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*Operações intermediárias
• filter
• map
• flatmap
• peek
• distinct
• sorted
• skip
• limit (*)
* short-circuit

Operações terminais
• forEach
• forEachOrdered
• toArray
• reduce
• collect
• min
• max
• count
• anyMatch (*)
• allMatch (*)
• noneMatch (*)
• findFirst (*)
• findAny (*)
* short-circuit*/

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		// Multiplicar todos os elementos da stream por 10
		Stream<Integer> st1 = list.stream().map(p -> p * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		// Adicionar elementos em uma Stream
		Stream<String> st2 = Stream.of("Ana", "Carlos", "Antonio", "Beatriz", "Alison", "Ana");
		System.out.println(Arrays.toString(st2.toArray()));

		// Criar uma Stream com iterate, o iterate cria elementos infinitamete 
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2).peek(p -> System.out.println("Teste" + p));
		// utiliza o limit para quantidade de elementos
		System.out.println(Arrays.toString(st3.limit(20).toArray()));

		// Somar todos os elementos
		
		int soma = list.stream().reduce(0, (x, y) -> x+y);
		System.out.println(soma);
		
		// nomes.stream().filter(n -> n.charAt(0) ==
		// 'A').limit(3).forEach(System.out::println);

	}

}
