package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo.*/

public class Main {
	
	// Criar um novo arquivo e inserir os dados do array
	public static void create(String path, String[] produtos) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			for (String p : produtos) {
				bw.write(p);
				bw.newLine();

			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// Cria uma nova pasta com um novo arquivo
	public static String newFolder(String path) {
		File folder = new File(path);
		File newFolder = new File(folder.getParent() + "/out");
		newFolder.mkdir();

		return newFolder + "/summary.csv";

	}

	// Passa os dados do primeiro arquivo para um arquivo atualizado
	public static void bw(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path));
				BufferedWriter bw = new BufferedWriter(new FileWriter(newFolder(path)))) {

			String line = br.readLine();

			while (line != null) {
				String[] dados = line.split(",");
				String nome = dados[0];
				String preco = dados[1];
				String quant = dados[2];
				double soma = Double.parseDouble(preco) * Integer.parseInt(quant);

				bw.write(nome + "," + String.format("%.2f", soma));
				bw.newLine();
				line = br.readLine();

			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// Faz a leitura dos arquivos
	public static void read(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

	public static void main(String[] args) {

		// Lista de produtos
		String[] produtos = new String[] { "TV LED,1290.99,1", "Video Game Chair,350.50,3", "Iphone X,900.00,2",
				"Samsung Galaxy 9,850.00,2" };
		// Caminho para criar o arquivo
		String path = "/home/rafael/Documentos/produtos/eletronicos.csv";

		Main.create(path, produtos);
		Main.bw(path);

		System.out.println("Arquivo original:\n");
		Main.read(path);
		System.out.println("\nArquivo atualizado:\n");
		Main.read(newFolder(path));

	}

}
