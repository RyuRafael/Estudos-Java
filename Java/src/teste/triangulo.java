package teste;
import java.util.Scanner;

public class triangulo {
	
	Scanner sc = new Scanner(System.in);
	
	
	double a = 0;
	double b = 0;
	double c = 0;
	
	public double calculo() {
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double area = ((a + b + c)/2);
		double area1 = Math.sqrt(15 * (15 - a)*(15-b)*(15-c));
		
		
		
		return area1;
	}

}
