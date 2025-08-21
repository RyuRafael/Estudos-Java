package teste;

import java.util.Scanner;
import teste.triangulo;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		product pd = new product();

		boolean b = true;

		System.out.println("write the name of product: ");
		pd.setName(sc.nextLine());
		sc.nextLine();
		System.out.println("write the price of product: ");
		pd.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("write the quantity of product: ");
		pd.setQuantity(sc.nextInt());
		sc.nextLine();

		do {
			System.out.println("1 - print product details: ");
			System.out.println("2 - add quantity product: ");
			System.out.println("3 - remove quantity product: ");
			System.out.println("4 - close: ");
			
			char op = sc.next().charAt(0);
			sc.nextLine();

			switch (op) {

			case '1':
				System.out.println(pd.toString());
				break;
			case '2':
				pd.addquantityproduct(sc.nextInt());
				break;
			case '3':
				pd.removequantityproduct(sc.nextInt());
				break;
			case '4':
				b = false;
				break;
			default:
				System.out.println("invalid value");

			}

		} while (b);

	}
}
