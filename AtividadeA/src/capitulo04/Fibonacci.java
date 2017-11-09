package capitulo04;

public class Fibonacci {
	public int calculaFibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		
		else if (n == 1) {
			return 1;
		}
		
		else {
			return calculaFibonacci(n-1) + calculaFibonacci(n-2);
		}
	}
	
	public int ternario(int n){
		return n <= 2 ? 1 : ternario(n - 1) + ternario(n - 2);
	}
}
