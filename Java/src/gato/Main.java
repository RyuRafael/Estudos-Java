package gato;

public class Main {

	public static void main(String[] args) {

		Animal gato = new Gato("terrestre", "an");
		Animal cachorro = new Cachorro("terrestre", "gato");
		
		gato.acao();
		gato.som();
		cachorro.acao();
		cachorro.som();

		
		System.out.println(gato);
		System.out.println(cachorro);

	}

}
