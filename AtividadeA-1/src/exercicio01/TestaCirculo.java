package exercicio01;

//Q08
public class TestaCirculo {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		
		circulo.raio = 4;
		
		System.out.println("Area: "+circulo.calculaArea());
		System.out.println("Perimetro: "+circulo.calculaPerimetro());

	}

}
