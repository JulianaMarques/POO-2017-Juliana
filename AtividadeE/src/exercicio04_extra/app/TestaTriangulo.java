package app;

import model.Triangulo;

public class TestaTriangulo {

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(10,10,10);
		
		System.out.println("Triangulo? "+triangulo.ehTriangulo());
		System.out.println("Equilatero? "+triangulo.ehEquilatero());
		System.out.println("Escaleno? "+triangulo.ehEscaleno());
		System.out.println("Isosceles? "+triangulo.ehIsosceles());

	}

}
