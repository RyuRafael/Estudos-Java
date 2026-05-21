package testeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MetodosSet {

	public static void main(String[] args) {
		
		/*
		
		Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4)); // Mais rápido, elemntos não ordenados
		Set<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4)); //mais lento (operações O(log(n)) em árvore rubro-negra)
		 														  //e ordenado pelocompareTo do objeto (ou Comparator)
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4)) // velocidade intermediária e elementos na ordem em que são adicionados
		System.out.println(set);
		set.add(5); // add elemento
		System.out.println(set);
		//set.clear(); // limpar set
		System.out.println(set);
		//set.removeIf(x -> x == 5); // remover
		//set.remove(2);
		System.out.println(set);
		*/
		
		Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3,4,5,8));
		Set<Integer> b = new HashSet<>(Arrays.asList(1,2,3,6,7,9,10));
		
		// União
		Set<Integer> c = new HashSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Interseção
		Set<Integer> d = new HashSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Diferença
		Set<Integer> e = new HashSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
		
		

	}

}
