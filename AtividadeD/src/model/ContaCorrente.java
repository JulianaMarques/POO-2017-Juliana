package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo) {
		super(saldo);
	}
	
	public void atualizar(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	public void depositar(double valor) {
		this.saldo += valor - 0.10;
	}
	

}
