package model;

public class Jogador {
	private int vidas;
	
	public Jogador() {
		this.vidas = 5;
	}
	
	public int getVidas() {
		return this.vidas;
	}
	
	public boolean isLimiteMaxVidas() {
		if(this.vidas == 5) {
			return true;
		}
		
		return false;
	}
	
	public boolean isLimiteMinVidas() {
		if(this.vidas == 0) {
			return true;
		}
		
		return false;
	}
	
	public void incrementarVidas() {
		if(this.vidas == 5) {
			this.vidas += 0;
		}
		
		this.vidas++;
	}
	
	public void decrementarVidas() {
		if(this.vidas == 0) {
			this.vidas -= 0;
		}
		
		this.vidas--;
	}
	
	public void doarVida(Jogador j) {
		if(this.isLimiteMinVidas()) {
			j.vidas += 0;
		}
		
		else if(j.isLimiteMaxVidas()){
			j.vidas += 0;
		}
		
		else {
			this.decrementarVidas();
			j.incrementarVidas();
		}
	}

}
