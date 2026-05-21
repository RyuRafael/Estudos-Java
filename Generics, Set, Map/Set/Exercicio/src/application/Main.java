package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

/*Um site de internet registra um log de acessos dos usuários. Um
registro de log consiste no nome de usuário (apenas uma palavra) e o
instante em que o usuário acessou o site no padrão ISO 8601,
separados por espaço, conforme exemplo. Fazer um programa que leia
o log de acessos a partir de um arquivo, e daí informe quantos usuários
distintos acessaram o site.*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> log = new HashSet<>();
			String readLine = br.readLine();

			while (readLine != null) {
				String[] x = readLine.split(" ");
				Date d = Date.from(Instant.parse(x[1]));
				log.add(new LogEntry(x[0], d));
				readLine = br.readLine();

			}

			System.out.println(log.size());

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
