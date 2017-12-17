package model;

public class Calculadora {
	private int operando1;
	private int operando2;
	
	public Calculadora(int operando1, int operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public int getOperando1() {
		return this.operando1;
	}
	
	public int getOperando2() {
		return this.operando2;
	}
	
	public int somar() {
		return this.operando1 + this.operando2;
	}
	
	public int subtrair() {
		return this.operando1 - this.operando2;
	}
	
	public int dividir() {
		return this.operando1 / this.operando2;
	}
	
}
