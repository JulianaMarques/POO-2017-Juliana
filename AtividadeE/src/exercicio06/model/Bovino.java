package model;

public class Bovino extends Animal{
	private float producaoLeite;
	
	public Bovino() {
		
	}
	
	public void setProducaoLeite(float producaoLeite) {
		this.producaoLeite = producaoLeite;
	}
	
	public float getProducaoLeite() {
		return this.producaoLeite;
	}
	
}
