package app;

import model.ManipuladorDeSeguroDeVida;

public class TestaContas {

	public static void main(String[] args) {
		ManipuladorDeSeguroDeVida manipulador = new ManipuladorDeSeguroDeVida();
		
		manipulador.criarSeguro(500, "Ju", 12345);
		
		System.out.println(manipulador.toString());

	}

}
