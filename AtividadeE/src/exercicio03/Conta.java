package exercicio03;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean transfere(Conta c, double valor) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			c.depositar(valor);
			return true;
		}
		
		return false;
	}
}
