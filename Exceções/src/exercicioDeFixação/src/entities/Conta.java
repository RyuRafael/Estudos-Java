package entities;

import exceptions.ExceptionConta;

public class Conta {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	private double limiteDeSaque;
	
	
	public Conta(int numeroConta, String titular, double saldo, double limiteDeSaque) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimiteDeSaque() {
		return limiteDeSaque;
	}


	public void setLimiteDeSaque(double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void saque(double valor) {
		validarSaque(valor);
		saldo -= valor;
	}
	
	public void validarSaque(double valor) {
		if(valor > getSaldo()) {
			throw new ExceptionConta("Erro de saque: Saldo insuficiente!");
			
		}
		if(valor > getLimiteDeSaque()) {
			throw new ExceptionConta("Você excedeu o limite de saque!");
		}
	}

}
