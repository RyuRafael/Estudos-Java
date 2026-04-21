package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServices {

	List<Object> list = new ArrayList<Object>();

	public void listAdd(Object valor) {
		list.add(valor);
	}

	public Object primeiroNumero() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia!");
		}

		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print("," + list.get(i));
		}
		System.out.print("]");
	}

}
