package model;

public class Triangulo {
	private int a;
	private int b;
	private int c;
	
	public Triangulo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean ehTriangulo() {
		if((Math.abs(b - c) < a) && (a < (b + c))) {
			return true;
		}
		
		return false;
	}
	
	public boolean ehEscaleno() {
		if(ehTriangulo()) {
			if(a != b && b != c) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
	}
	
	public boolean ehIsosceles() {
		if(ehTriangulo()) {
			if(a != b || b != c || a != c) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
	}
	
	public boolean ehEquilatero() {
		if(ehTriangulo()) {
			if(a == b && b == c) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
	}
}
