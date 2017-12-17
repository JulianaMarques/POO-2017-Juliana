package model;

public class Empregado {
	private double salario;
	
	public Empregado(double salario) {
		this.salario = salario;
	}
	
	public double calcSalario() {
		return this.salario;
	}
}
