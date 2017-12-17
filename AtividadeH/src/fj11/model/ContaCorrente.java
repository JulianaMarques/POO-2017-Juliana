package model;

public class ContaCorrente implements Conta, Tributavel {
	protected double saldo;
	private String titular;

	public ContaCorrente(double saldo, String titular) {
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

	public void atualizar(double taxa) {
	    this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public String getTitular() {
		return this.getTitular();
	}

	@Override
	public String getTipo() {
		return "Tipo: "+this.getClass();
	}
}
