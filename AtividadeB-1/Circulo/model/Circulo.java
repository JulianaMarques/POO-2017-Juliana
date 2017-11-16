package model;

import java.math.*;

public class Circulo {

	private double raio;
	private double diametro;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public double calcularCircunferencia() {
		return 2 * 3.14 * raio;
	}
	
	public double calcularArea() {
		return 3.14 * Math.pow(raio, 2);
	}
	
	public void validarRaio() {
		if(this.raio < 0) {
			setRaio(1);
		}
	}
	
	public void aumentarRaio(double valor) {
		this.raio += valor;
	}
	
	

}
