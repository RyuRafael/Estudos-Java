package produtos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ArrayList<Produto> produtos = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		int totalProdutos = sc.nextInt();
		
		for(int i = 1; i <= totalProdutos; i++) {
			System.out.println("Prdouto #" + i);
			System.out.println("Produto normal, importado ou usado (n,i,u)? ");
			char opcao = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if(Character.toUpperCase(opcao) == 'N') {
				Produto produto = new Produto(nome,preco);
				produtos.add(produto);
			}
			
			else if(Character.toUpperCase(opcao) == 'I') {
				System.out.print("Taxa de importação: ");
				double taxa = sc.nextDouble();
				
				Produto produtoImportado = new ProdutoImportado(nome, preco, taxa);
				produtos.add(produtoImportado);
			}
			
			else if(Character.toUpperCase(opcao) == 'U') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				sc.nextLine();
				String data = sc.nextLine();
				Date dataFormatada = sdf.parse(data);
				
				Produto produtoUsado = new ProdutoUsado(nome, preco, dataFormatada );
				produtos.add(produtoUsado);
			}
			
			else {
				System.out.println("Produto não identificado! tente novamente:");
				i -= 1;
			}
		}
		
		System.out.println("\nTabela de preços:\n");
		for(Produto p : produtos) {
			System.out.println(p.etiquetaPreco() + "\n");
		}

		sc.close();
	}
}
