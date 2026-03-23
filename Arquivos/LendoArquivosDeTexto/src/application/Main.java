package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String path = "/home/rafael/Documentos/good.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String file = br.readLine();
			
			while(file != null) {
				System.out.println(file);
				file = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		finally {
			try {
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					br.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
