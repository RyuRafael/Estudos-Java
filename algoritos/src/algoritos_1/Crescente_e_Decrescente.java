package algoritos_1;
import java.util.Scanner;

public class Crescente_e_Decrescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if(x == y) {
				break;
			}
			
			
			 if(x < y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}

		}
		

	}

}
