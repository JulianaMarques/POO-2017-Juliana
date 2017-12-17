package model;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(String nome, double saldo) {
		super(nome, saldo);
	}

	@Override
	public double calcularTributos() {
		return this.getSaldo() * 0.1;
	}
}
