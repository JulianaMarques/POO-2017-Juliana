package model;

public class ManipuladorDeSeguroDeVida {
	private SeguroDeVida seguroDeVida;
	
	public ManipuladorDeSeguroDeVida() {
		
	}
	
	public void criarSeguro(double valor, String titular, int numeroApolice) {
		seguroDeVida = new SeguroDeVida(500, "Ju", 24534);
		
		seguroDeVida.setTitular(titular);
		seguroDeVida.setValor(valor);
		seguroDeVida.setNumeroApolice(numeroApolice);
	}
}
