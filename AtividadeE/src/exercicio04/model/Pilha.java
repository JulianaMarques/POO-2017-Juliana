package model;

public class Pilha {
	private int[] pilha = new int[5];
	private int posicao = 0;
	
	public Pilha() {
		
	}
	
	
	public void empilhar(int valor) {
		this.pilha[this.posicao] = valor;
		this.posicao++;
	}
	
	public boolean estaCheia() {
		if(this.posicao == 5) {
			return true;
		}
		
		return false;
	}
	
	public int retornarTopo() {
		return  this.pilha[this.posicao-1];
	}
	
	public String exibir() {
		String p = "";
		
		for (int i = 0; i < this.posicao; i++) {
			p += i +" -> "+this.pilha[i]+"\n";
		}
		
		return p;
	} 
}
