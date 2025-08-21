package gato;

public class Cachorro extends Animal {

	Cachorro(String habitat, String nome) {
		super(habitat, nome);

	}

	public void acao() {
		fazacao = "correr";
	}

	public void som() {

		fazsom = "au au auauauauau";

	}

}
