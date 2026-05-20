package application2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrincipioGetPut {

	public static void main(String[] args) {

		List<Integer> myInt = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> myDouble = Arrays.asList(2.34, 45.3);
		List<Object> myObjs = new ArrayList<>();

		copy(myDouble, myObjs);
		copy(myInt, myObjs);

		printList(myObjs);
	}

	
	public static void copy(List<? extends Number> origen, List<? super Number> destino) {
		for (Number n : origen) {
			destino.add(n);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
