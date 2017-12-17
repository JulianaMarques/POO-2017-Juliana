package model;

public class ManipuladorDeTributaveis {
	Tributavel[] tributaveis;
	private int indice;
	
	public ManipuladorDeTributaveis(int tamanho) {
		this.tributaveis = new Tributavel[tamanho];
	}
	
	public void adicionarTributavel(Tributavel tributavel) {
		this.tributaveis[indice] = tributavel;
		indice++;
	}
	
	public double calcularImpostos() {
		double valorTotal = 0.0;
		
		for (int i = 0; i < indice; i++) {
			valorTotal += tributaveis[i].getValorImposto();
		}
		
		return valorTotal;
	}

}
