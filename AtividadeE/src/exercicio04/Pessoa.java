package exercicio04;

public class Pessoa {
	private int id;
	private String nome;
	
	public Pessoa(String nome) {
		this.id = id++;
		this.nome = nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
}
