package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import services.CalculoService;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		String path = "/home/rafael/Documentos/números.txt";
		CalculoService cs = new CalculoService();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				list.add(Integer.parseInt(line));
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.println(cs.max(list));

	}

}
