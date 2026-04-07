package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import model.Funcionario;

/*Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode*/

public class Main {

	public static void main(String[] args) {
		
		String caminho = "/home/rafael/Documentos/listanomes.csv";
		
		List<Funcionario> list = new ArrayList<Funcionario>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] sp = line.split(",");
				Funcionario funcionario = new Funcionario(sp[0], Double.parseDouble(sp[1]));
				list.add(funcionario);
				line = br.readLine();
			}
			
			Collections.sort(list);
			for (Funcionario nomes : list) {
				System.out.println(nomes.getNome() + ", " + nomes.getSalario());
			}
			
		}
		catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

}
