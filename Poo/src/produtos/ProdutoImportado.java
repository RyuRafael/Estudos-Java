package produtos;

public class ProdutoImportado extends Produto{
	
	private double taxaImportacao;

	public ProdutoImportado(String nome, double preco, double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	@Override
	public String etiquetaPreco(){
		return getNome() + " $ " + precoTotal() + " (Taxa de importação $ " + getTaxaImportacao() + ")";
	}
	
	public double precoTotal() {
		return getPreco() + taxaImportacao;
	}

}
