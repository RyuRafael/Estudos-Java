package application;

/*Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele, conforme exemplo.
*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		Set<Integer> c = new HashSet<Integer>();

		for (char i = 'A'; i < 'D'; i++) {
			System.out.println("Quantos alunos para o curso " + i + "? ");
			int n = sc.nextInt();

			for (int j = 1; j <= n; j++) {
				System.out.print("Estudante #" + j + ": ");
				if (i == 'A') {
					a.add(sc.nextInt());
				} else if (i == 'B') {
					b.add(sc.nextInt());
				} else if (i == 'C') {
					c.add(sc.nextInt());
				}
			}
		}

		Set<Integer> d = new HashSet<Integer>(a);

		d.addAll(c);
		d.addAll(b);

		System.out.println("Total de estudantes: " + d.size());

	}

}
