package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServices {

	List<Integer> list = new ArrayList<Integer>();

	public void listAdd(int valor) {
		list.add(valor);
	}
	
	public int primeiroNumero() {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista vazia!");
		}
		
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		System.out.print(list.get(0));
		for(int i = 1; i < list.size(); i++) {
			System.out.print("," + list.get(i));
		}
		System.out.print("]");
	}

}
