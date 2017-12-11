package model;

public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	 public void rodar(Conta c) {
	     c.atualizar(this.selic);
	     this.incrementaSaldo(c.getSaldo());
	 }

	 public void incrementaSaldo(double valor){
	     this.saldoTotal += valor;
	 }

	 public double getSaldoTotal(){
	     return this.saldoTotal;
	 }

}
