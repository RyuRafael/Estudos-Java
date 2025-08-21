package gato;

public class Gato extends Animal {

	Gato(String habitat, String nome) {
		super(habitat, nome);

	}

	public void acao() {
		fazacao = "correr";
	}

	public void som() {

		fazsom = "miau miau!";

	}

}
