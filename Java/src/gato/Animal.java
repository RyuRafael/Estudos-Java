package gato;

public class Animal {

	protected String fazacao;
	protected String fazsom;
	protected String habitat;
	protected String nome;
	

	
	
	Animal(String habitat, String nome){
		
		this.habitat = habitat;
		this.nome = nome;
		
		
		
	}
	
	public void acao() {

		fazacao = "correr,nadar,voar";

	}

	public void som() {
		fazsom = "som";
	}

	public String toString() {

		return nome+"\n" + habitat + "\n" + fazacao + "\n" + fazsom + "\n";
	}	

}


