package model;

public class Quadrado implements FiguraGeometrica, Comparavel {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return lado * 4;
	}

	@Override
	public int comparar(FiguraGeometrica figura) {
		if(this.calcularArea() < figura.calcularArea()) {
			return -1;
		}
		
		else if(this.calcularArea() == figura.calcularArea()) {
			return 0;
		}
		
		else {
			return 1;
		}
	}
}
