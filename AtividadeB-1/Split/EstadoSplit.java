package Split;

import javax.swing.JOptionPane;

public class EstadoSplit {
	private String Estado;
	private String Temperatura;
	private String Velocidade;
	private String Modo;
	String msg = ("Operacao invalida.");
	
	public EstadoSplit(String estado,String temperatura,String velocidade,String modo){
		this.Estado = estado;
		this.Temperatura = temperatura;
		this.Velocidade = velocidade;
		this.Modo = modo;
	}
	
	public void liga_desliga(){
		if (this.Estado == "Desligado"){
			this.Estado = "Ligado";
		}
		else{
			if(this.Estado == "Ligado"){
				this.Estado = "Desligado";
			}
		
		}
	
}
	public void Velocidade(String velocidade){
		if (this.Estado == "Desligado"){
			JOptionPane.showMessageDialog(null, this.msg);
		}
		else{
			this.Velocidade = velocidade;
		}
		
	}
	public void Temperatura(String temperatura){
		if (this.Estado == "Desligado"){
			JOptionPane.showMessageDialog(null, this.msg);
		}
		if(this.Modo == "Ventilar"){
			JOptionPane.showMessageDialog(null, this.msg);
		}
		else{
			this.Temperatura = temperatura;
		}
	}
	
	public void Modo(String modo){
		if (this.Estado == "Desligado"){
			JOptionPane.showMessageDialog(null, this.msg);
		}
		else{
			this.Modo = modo;
			if (this.Modo == "ventilar"){
				this.Temperatura = "--";
			}
			if(this.Modo == "Frio"){
				this.Temperatura = "15";
			}
		}
	}
	public void Estado(){
		String msg = ("Estado: "+this.Estado+" \nVelocidade: "+this.Velocidade+" \nTemperatura: "+this.Temperatura+
				" \nModo: "+this.Modo);
		JOptionPane.showMessageDialog(null, msg);
	}
}
