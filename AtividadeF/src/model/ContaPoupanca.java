package model;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	@Override
	public void atualizar(double taxa) {
		this.atualizar(getSaldo() * taxa * 3); 
	}

	//public void atualizar(double taxa) {
	//	super.atualizar(taxa * 3);
	//}
	
}
