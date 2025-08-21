package averageHeight;

import java.util.Scanner;

import java.util.Locale;

public class averageHeight {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of people");

		int n = sc.nextInt();

		double[] vect = new double[n];

		double sum = 0;

		for (int i = 0; i < vect.length; i++) {

			System.out.println("Enter the height of the first person: " + (i + 1) + "º");

			vect[i] = sc.nextDouble();

		}

		for (int j = 0; j < vect.length; j++) {

			sum += vect[j];
		}

		double averageHeight = sum / vect.length;

		System.out.printf("Average height = %.2f",  averageHeight);


		sc.close();
	}

}
