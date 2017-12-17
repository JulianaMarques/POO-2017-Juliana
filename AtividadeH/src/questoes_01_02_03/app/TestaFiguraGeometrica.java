package app;

import model.Quadrado;
import model.Triangulo;

public class TestaFiguraGeometrica {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(5);
		Triangulo triangulo = new Triangulo(7,8,9,15);
		
		System.out.println("Area do quadrado: "+quadrado.calcularArea());
		System.out.println("Perimetro do quadrado: "+quadrado.calcularPerimetro());
		
		System.out.println("Area do triangulo: "+triangulo.calcularArea());
		System.out.println("Perimetro: "+triangulo.calcularPerimetro());
		
		System.out.println("Comparando Areas (-1 - Menor, 0 - Igual, 1 - Maior): "+quadrado.comparar(triangulo));

	}

}
