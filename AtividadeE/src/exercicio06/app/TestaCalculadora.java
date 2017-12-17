package app;

import model.CalculadoraCientifica;

public class TestaCalculadora {
	public static void main(String[] args) {
		CalculadoraCientifica c = new CalculadoraCientifica(10, 20);
		System.out.println(c.exponenciar());
		System.out.println(c.dividir());
	}
}
