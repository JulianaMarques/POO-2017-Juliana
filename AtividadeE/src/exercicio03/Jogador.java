package exercicio03;

public class Jogador {
	private int forca;
	private int nivel;
	private int pontosAtuais;
	
	public Jogador(int forca, int nivel, int pontosAtuais) {
		this.forca = forca;
		this.nivel = nivel;
		this.pontosAtuais = pontosAtuais;
	}
	
	public int getPontosAtuais() {
		return this.pontosAtuais;
	}
	
	public int calcularAtaque() {
		return this.forca * this.nivel;
	}
	
	public void atacar(Jogador j) {
		this.pontosAtuais -= j.calcularAtaque();
	}

}
