package model;

public abstract class Conta {
	protected double saldo;
	private String numero;
	private Pessoa titular;
	
	public Conta(String numero, Pessoa titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public abstract void depositar(double valor);
	public abstract boolean sacar(double valor);
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public Pessoa getTitular() {
		return this.titular;
	}
	
	public String toString() {
		String s = "Titular: "+this.titular.getNome()+"\n"+"Numero: "+this.numero+"\n"+"Saldo: "+this.saldo;
		
		return s;
	}
}
