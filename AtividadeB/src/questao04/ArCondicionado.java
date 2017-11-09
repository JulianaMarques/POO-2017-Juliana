package questao04;

public class ArCondicionado {
	private String marca;
	private String tipo;
	private int potencia; //BTUs
	
	public ArCondicionado() {
		this.tipo = "Split";
	}
	
	public void ligar() {
		System.out.println("Ar condicionado ligado!");
	}
	
	public void desligar() {
		System.out.println("Ar condicionado desligado!");
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void set(int potencia) {
		this.potencia = potencia;
	}
	
	public int setPotencia() {
		return potencia;
	}
}
