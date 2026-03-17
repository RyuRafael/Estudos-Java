package produtos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date data;

	public ProdutoUsado(String nome, double preco, Date data) {
		super(nome, preco);
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() + " (Usado) " +  " $ " + getPreco() + " (Data de fabricação: " + sdf.format(data) + ")";
	}

}
