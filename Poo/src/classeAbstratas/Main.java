package classeAbstratas;

import java.util.ArrayList;
import java.util.Scanner;
import classeAbstratas.Cor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Forma> formas = new ArrayList<Forma>();
		
		System.out.print("Digite o número de formas: ");
		int numFormas = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= numFormas; i++) {
			System.out.println("Forma #" + i);
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char rc = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Escolha uma cor (PRETO/AZUL/VERMELHO):");
			String cor = sc.nextLine();
			
			if(rc == 'r') {
				System.out.print("Digite a altura: ");
				double altura = sc.nextDouble();
				System.out.print("Digite a largura: ");
				double largura = sc.nextDouble();
				
				formas.add(new Retangulo(Cor.valueOf(cor), altura, largura));
				
				sc.nextLine();
			}
			else{
				System.out.print("Digite o raio: ");
				double raio = sc.nextDouble();
				
				formas.add(new Circulo(Cor.valueOf(cor), raio));
				
				sc.nextLine();
			}
		}
		
		System.out.println("Área das formas");
		for(Forma f : formas) {
			System.out.printf("%.2f%n", f.area());
			System.out.println(f.getCor());
		}
	}

}
