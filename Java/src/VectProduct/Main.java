package VectProduct;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Amount of product to register: ");
		int n = sc.nextInt();

		Product[] pd = new Product[n];

		double sum = 0;

		for (int i = 0; i < n; i++) {

			sc.nextLine();
			System.out.println("Name of product: ");
			String name = sc.nextLine();
			System.out.println("price of product: ");
			double price = sc.nextDouble();

			pd[i] = new Product(name, price);

		}

		for (int i = 0; i < n; i++) {

			sum += pd[i].getPrice();

			System.out.printf("Name: %s     Price: %.2f%n", pd[i].getName(), pd[i].getPrice());

		}

		double avg = sum / n;

		System.out.printf("Avarage of all Products: %.2f", avg);

	}

}
