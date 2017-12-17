package model;

public class AuditoriaInterna {
	private Tributavel[] tributaveis;
	private int indice;
	
	public AuditoriaInterna(int tamanho) {
		this.tributaveis = new Tributavel[tamanho];
	}
	
	public void adicionar(Tributavel tributavel) {
		this.tributaveis[indice] = tributavel;
		indice++;
	}
	
	public double calcularTributos() {
		double valorTotal = 0.0;
		
		for (int i = 0; i < indice; i++) {
			valorTotal += tributaveis[i].calcularTributos();
		}
		
		return valorTotal;
	}
	
	public String toString() {
		String s = "Valor Total de Tributos: R$ "+calcularTributos();
		
		return s;
	}

}
