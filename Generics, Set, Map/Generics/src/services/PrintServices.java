package services;

import java.util.ArrayList;
import java.util.List;

// Define a classe como generica
public class PrintServices<T> {

	// Pode ser armazenado diferentes tipos de dados sem sem precissar ser reescrito
	List<T> list = new ArrayList<T>();

	public void listAdd(T valor) {
		list.add(valor);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia!");
		}

		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print("," + list.get(i));
		}
		System.out.print("]");
	}

}
