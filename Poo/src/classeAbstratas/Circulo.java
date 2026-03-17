package classeAbstratas;

public class Circulo extends Forma{
	
	private double raio;
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}

}
