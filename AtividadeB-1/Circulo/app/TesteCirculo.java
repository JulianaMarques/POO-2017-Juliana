package app;

import model.Circulo;
import javax.swing.JOptionPane;

public class TesteCirculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		
		circulo.setRaio(2);
		circulo.setDiametro(4);
		
		
		String msg = ("Raio: "+circulo.getRaio()+"\n"+"Diametro: "+circulo.getDiametro()+"\n"+"Area: "+circulo.calcularArea()+"\n"+"Circunferencia: "+circulo.calcularCircunferencia());
		
		JOptionPane.showMessageDialog(null, msg);
		
		
		
		
		
		

	}

}
