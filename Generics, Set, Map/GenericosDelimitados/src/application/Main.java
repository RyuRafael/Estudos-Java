package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import entities.Produto;
import services.CalculoService;

public class Main {

	public static void main(String[] args) {

		String path = "/home/rafael/Documentos/números.txt";
		CalculoService cs = new CalculoService();
		List<Produto> produtos = new ArrayList<Produto>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] sp = line.split(",");
				String j = sp[0];
				Produto pd = new Produto(sp[0], Double.valueOf(sp[1]));
				produtos.add(pd);
				line = br.readLine();
			}
			
			Produto x = cs.max(produtos);
			
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
