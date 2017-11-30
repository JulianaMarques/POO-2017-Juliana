package model;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
}
