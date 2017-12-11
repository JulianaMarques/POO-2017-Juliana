package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo) {
		super(saldo);
	}
	
	@Override
	public void atualizar(double taxa) {
		this.atualizar(getSaldo() * taxa * 2); 
	}
	
	public void depositar(double valor) {
		super.depositar(valor - 0.10);
	}

}
