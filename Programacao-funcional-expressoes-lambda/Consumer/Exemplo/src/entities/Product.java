package entities;

public class Product {

	private String nome;
	private double preco;

	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static void staticPriceUpdate(Product p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	
	@Override
	public String toString() {
		return "Product [nome=" + nome + ", preco=" + String.format("%.2f", preco) + "]";
	}

}
