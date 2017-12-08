package exercicio03_extra;

public class TestaJogador {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		
		jogador1.decrementarVidas();
		//jogador1.decrementarVidas();
		jogador2.decrementarVidas();
		jogador1.doarVida(jogador2);
		
		System.out.println("Jogador 1: "+jogador1.getVidas()+" vidas");
		System.out.println("Jogador 2: "+jogador2.getVidas()+" vidas");
		

	}

}
