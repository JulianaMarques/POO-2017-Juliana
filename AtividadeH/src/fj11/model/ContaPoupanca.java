package model;

public class ContaPoupanca implements Conta {
	protected double saldo;
	private String titular;

	public ContaPoupanca(double saldo, String titular) {
	    this.saldo = saldo;
	    this.titular = titular;
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
	 
	public String getTitular() {
		return this.titular;
	}

	public void atualizar(double taxa) {
	    this.saldo += this.saldo * taxa * 2;
	}
}
