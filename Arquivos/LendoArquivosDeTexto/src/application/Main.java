package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Instanciar um objeto do tipo file que recebe o caminho do arquivo txt.
		File file = new File("/home/rafael/Documentos/good.txt");
		Scanner sc = null;
		
		try {
			// Ler o arquivo
			sc = new Scanner(file);
			
			// Percorer cada linha do arquivo
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
