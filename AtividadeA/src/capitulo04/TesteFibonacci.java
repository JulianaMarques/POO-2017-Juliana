package capitulo04;

public class TesteFibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		
		for (int i = 0; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
		}
		
		for (int i = 0; i <= 6; i++) {
			int result = fibonacci.ternario(i);
			System.out.println(result);
		}

	}

}
