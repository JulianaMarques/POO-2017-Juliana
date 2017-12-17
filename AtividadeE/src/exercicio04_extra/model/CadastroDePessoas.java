package model;

public class CadastroDePessoas {
	int indice;
	Pessoa[] pessoas = new Pessoa[5];
	
	public CadastroDePessoas() {
		
	}
	
	public void cadastrar() {
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa("Juliana");
		}
	}

}
