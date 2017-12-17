package model;

public class CalculadoraCientifica extends Calculadora {

	public CalculadoraCientifica(int operando1, int operando2) {
		super(operando1, operando2);
	}
	
	public int exponenciar() {
		return (int) Math.pow(super.getOperando1(), super.getOperando2());
		
	}
	
	public double dividir(boolean ehArredondado) {
		double resultado = super.dividir();
		double parteDecimal = (resultado * 100) % 100;
		
		//Arredonda pra cima
		if(parteDecimal > 5 ) {
			ehArredondado = true;
			return Math.ceil(resultado);
		}
		
		return resultado; 
	}

}
