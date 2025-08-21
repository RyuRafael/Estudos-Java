package algoritos_1;

import java.util.Scanner;

public class Grenais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;
		int gremioVence = 0;
		int interVence = 0;
		int empates = 0;
		int grenais = 0;

		while (b) {

			int inter = sc.nextInt();
			int gremio = sc.nextInt();

			grenais += 1;

			if (gremio > inter) {
				gremioVence++;
			}

			else if (inter > gremio) {
				interVence++;
			}

			else {
				empates++;
			}

			System.out.println("Novo grenal (1-sim 2-nao)");
			int novoGrenal = sc.nextInt();

			switch (novoGrenal) {

			case 1:
				continue;
			case 2:
				b = false;
			}

		}

		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + interVence);
		System.out.println("Gremio:" + gremioVence);
		System.out.println("Empates:" + empates);

		if (gremioVence > interVence) {
			System.out.println("Gremio venceu mais");
		}

		else if (interVence > gremioVence) {

			System.out.println("Inter venceu mais");

		}

		else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();

	}

}
