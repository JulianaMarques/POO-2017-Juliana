package model;

public class Diarista extends Empregado {

	public Diarista(double salario) {
		super(salario);
		// TODO Auto-generated constructor stub
	}
	
	public double calcSalario() {
		return super.calcSalario() / 30;
	}

}
