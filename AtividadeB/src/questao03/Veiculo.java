package questao03;

public class Veiculo {
	private String modelo;
	private Montadora montadora;
	private String cor;
	private String anoFab;
	
	public Veiculo(String modelo, Montadora montadora, String cor, String anoFab) {
		this.modelo = modelo;
		this.cor = cor;
		this.anoFab = anoFab;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}
	
	public String getAnoFab() {
		return anoFab;
	}
	
	
	
	
}
