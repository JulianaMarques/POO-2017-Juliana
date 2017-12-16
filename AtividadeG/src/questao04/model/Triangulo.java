package model;

public class Triangulo extends FiguraGeometrica{
	private int lado1;
	private int lado2;
	private int lado3;
	private int altura;
	
	public Triangulo(int lado1, int lado2, int lado3, int altura) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (this.lado3 * this.altura) / 2;
	}

	@Override
	public int calcularPerimetro() {
		return this.lado1 + this.lado2 + this.lado3;
	}	

}
