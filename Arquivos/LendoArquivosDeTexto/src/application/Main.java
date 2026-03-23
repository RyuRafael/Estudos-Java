package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String path = "/home/rafael/Documentos/good.txt";
		
		// Agora o BufferedReader e o FileReader são instanciados dentro da declaração do bloco try
		// Fecha automaticamente o BufferedReader e o FileReader
		try (BufferedReader br = new BufferedReader( new FileReader(path))){
			
			String file = br.readLine();
			
			while(file != null) {
				System.out.println(file);
				file = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}

}
