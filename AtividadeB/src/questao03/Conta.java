package questao03;

public class Conta {
	int numero;
	Cliente cliente;
	double saldo;
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.cliente = new Cliente();
		this.saldo = saldo;
	}
}
