package model;

public class Conta {
	protected double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		}
		
		else {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa;
	}

}
