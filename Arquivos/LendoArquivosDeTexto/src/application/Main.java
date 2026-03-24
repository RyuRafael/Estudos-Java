package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Rafael","Bob","Maria"};
		Scanner sc = new Scanner(System.in);
		//Caminho que quer criar um novo arquivo
		String path = "/home/rafael/Documentos/nomes.txt";
		
		// Instancia o objeto
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
//			
//			System.out.println("Digite a quantidade de nomes que você quer escrever: ");
//			int n = sc.nextInt();
//			sc.nextLine();
//			
//			for(int i = 1; i <= n; i++) {
//				System.out.println("Digite o nome #" + i + ": ");
//				String nome = sc.nextLine();
//				// Escreve o nome digitado no arquivo
//				// Também posso passar um lista de nomes: bw.write(lines);
//				bw.write(nome);
//				// Faz uma quebra de linha
//				bw.newLine();
//			}
//		}
//		catch (Exception e) {
//			System.out.println("Erro " + e.getMessage());
//		}
		
		// Ler o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
