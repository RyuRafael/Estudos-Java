package model;

public class Funcionario implements Comparable<Funcionario> {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// comparar os valores
	public int compareTo(Funcionario outroNome) {
		// TODO Auto-generated method stub
		return nome.compareTo(outroNome.getNome());
	}

}
