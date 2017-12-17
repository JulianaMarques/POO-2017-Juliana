package model;

public class Postagem {
	private int id;
	private String texto;
	private int qtdCurtidas;
	
	public Postagem(int id, String texto) {
		this.id = id;
		this.texto = texto;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void curtir() {
		qtdCurtidas++;
	}
	
	public String toString() {
		return texto + "\nCurtidas: " + qtdCurtidas;
	}
}
