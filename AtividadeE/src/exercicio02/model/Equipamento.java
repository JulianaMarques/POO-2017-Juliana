package model;

public class Equipamento {
	private boolean ligado;
	
	public Equipamento() {
		this.ligado = false;
		
	}
	
	public void ligar() {
		this.ligado = true;
	} 
	
	public void desligar() {
		this.ligado = false;
	}
	
	public boolean getLigado() {
		return this.ligado;
	}
	
	public void inverter() {
		if(getLigado()) {
			desligar();
		}
		
		else {
			ligar();
		}
	}

}
