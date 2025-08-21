package rectangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rc = new Rectangle();
		
		System.out.println("Enter rectangle heigth and widgth: ");
		rc.height = sc.nextDouble();
		rc.width = sc.nextDouble();
		
		
		
		System.out.println("AREA = " + String.format("%.2f", rc.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rc.perimetro()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rc.diagonal()));
		
		sc.close();

	}

}
