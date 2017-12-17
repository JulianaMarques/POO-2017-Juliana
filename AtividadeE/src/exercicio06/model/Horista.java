package model;

public class Horista extends Diarista {

	public Horista(double salario) {
		super(salario);
		// TODO Auto-generated constructor stub
	}
	
	public double calcSalario() {
		return super.calcSalario() / 24;
	}
	
}
