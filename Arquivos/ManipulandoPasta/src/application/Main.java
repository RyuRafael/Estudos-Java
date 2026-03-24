package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Caminho das pastas
		String pathFolder = "/home/rafael/Estudos-Java";
		
		File pathFolders = new File(pathFolder);
		
		// Cria uma lista File com o nome de todas as pastas Mostrar todas as pastas dentro do caminho
		File[] folders = pathFolders.listFiles(File::isDirectory);
		
		System.out.println("Pastas\n");
		for (File file : folders) {
			System.out.println(file);
		}
	}

}
