package algoritos_1;

import java.util.Scanner;

public class Pum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = 1;
		int y = 2;
		int z = 3;

		for (int i = 0; i < n; i++) {
			
			System.out.println(x + " " + y + " " + z + " " + "PUM");
			x += 4;
			y += 4; 
			z += 4;

		}
	}

}
