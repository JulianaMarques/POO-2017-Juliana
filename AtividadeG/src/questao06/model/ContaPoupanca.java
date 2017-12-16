package model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String numero, Pessoa titular, double saldo) {
		super(numero, titular, saldo);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = valor;
		
	}

	@Override
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			return true;
		}
		
		return false;
	}

}
