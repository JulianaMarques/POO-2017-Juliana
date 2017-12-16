package model;

public class Quadrado extends FiguraGeometrica {
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public int calcularPerimetro() {
		return this.lado * 4;
	}

}
