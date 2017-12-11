package model;

public abstract class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			
			return true;
		}
		
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
		
	public abstract void atualizar(double taxa);
}
