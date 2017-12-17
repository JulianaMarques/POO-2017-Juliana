package model;

public class SeguroDeVida implements Tributavel {
	private double valor;
	private String titular;
	private int numeroApolice;
	
	public SeguroDeVida(double valor, String titular, int numeroApolice) {
		this.valor = valor;
		this.titular = titular;
		this.numeroApolice = numeroApolice;
	}
	
	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	@Override
	public String getTitular() {
		return this.titular;
	}

	@Override
	public String getTipo() {
		return "Tipo: "+this.getClass();
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
		
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	public int getNumeroApolice() {
		return this.numeroApolice;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String toString() {
		String s = "Titular: "+this.getTitular()+"\n"+"Valor: "+this.getValor()+"\n"+"Num. Apolice: "+this.getNumeroApolice();
		return s;
	}
}
