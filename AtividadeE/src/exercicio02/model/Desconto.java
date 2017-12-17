package model;

public class Desconto {
	private double valorOriginal;
	private int desconto;
	
	public Desconto(int desconto, double valorOriginal) {
		this.desconto = desconto;
		this.valorOriginal = valorOriginal;
	}
	
	public double getValorOriginal() {
		return this.valorOriginal;
	}
	
	public double getDesconto() {
		return this.desconto;
	}
	
	public double calcular() {
		return ((this.valorOriginal * (1 - this.desconto) / 100) * 10) * -1;
	}
	
}
