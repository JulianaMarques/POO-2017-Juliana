package app;

import model.Pilha;

public class TestaPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		for (int i = 0; i < 5; i++) {
			pilha.empilhar(i);
		}
		
		System.out.println("Esta Cheia? "+pilha.estaCheia());
		System.out.println("Elemento do Topo: "+pilha.retornarTopo());
		System.out.println("Elementos da Pilha:");
		System.out.println(pilha.exibir());
	}

}
