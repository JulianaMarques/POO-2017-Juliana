package exercicio01;

//Q08
public class Circulo {
	double raio;
	double PI = 3.14;
	
	double calculaArea() {
		return PI * (this.raio * this.raio);
	}
	
	double calculaPerimetro() {
		return 2 * PI * this.raio;
	}
}
