package model;

public class ImpostoDeRenda {
	private double rendaBruta;
	
	public ImpostoDeRenda(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public double getRendaBruta() {
		return this.rendaBruta;
	}
	
	public double calcularImposto() {
		if(this.rendaBruta >= 0 && this.rendaBruta <=1000) {
			return rendaBruta * 0.05;
		}
		
		return this.rendaBruta * 0.1;
	}
	
	public double calcularRendaLiquida() {
		return this.rendaBruta - calcularImposto();
	}

}
