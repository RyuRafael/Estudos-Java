package TestList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("rafael");
		list.add("maria");
		list.add("renato");
		list.add("bob");
		list.add(2, "marco");

		System.out.println(list.size());
		System.out.println("...................................");

		for (String p : list) {

			System.out.println(p);

		}
		System.out.println("...................................");

		list.removeIf(s -> s.charAt(0) == 'r');
		System.out.println(list.size());

		for (String p : list) {

			System.out.println(p);

		}

		System.out.println("...................................");

		System.out.println(list.indexOf("sonia"));
		System.out.println(list.indexOf("valmir"));
		System.out.println("...................................");

		List<String> result = list.stream().filter(s -> s.charAt(0) == 'm').collect(Collectors.toList());

		System.out.println("...................................");
		for (String p : result) {
			System.out.println(result);
		}

		System.out.println("...................................");

		String name = list.stream().filter(x -> x.charAt(0) == 'p').findAny().orElse("nao encontrado");
		System.out.println(result.get(0));

		System.out.println("...................................");

	}

}
