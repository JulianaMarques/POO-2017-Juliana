package app;

import model.Jogador;

public class TestaJogador {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador(200, 3, 1000);
		Jogador jogador2 = new Jogador(100, 2, 700);
		
		jogador1.atacar(jogador2);
		jogador2.atacar(jogador1);
		
		System.out.println("Jogador 1: "+jogador1.getPontosAtuais()+" pontos");
		System.out.println("Jogador 2: "+jogador2.getPontosAtuais()+" pontos");
		
		if(jogador1.getPontosAtuais() > jogador2.getPontosAtuais()) {
			System.out.println("Jogador 1 venceu!");
		}
		
		else if(jogador1.getPontosAtuais() < jogador2.getPontosAtuais()) {
			System.out.println("Jogador 2 venceu!");
		}
		
		else {
			System.out.println("Empate!");
		}

	}

}
