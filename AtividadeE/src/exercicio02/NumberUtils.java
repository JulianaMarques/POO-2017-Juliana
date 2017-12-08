package exercicio02;

public class NumberUtils {
	private int n;
	
	public NumberUtils(int n) {
		this.n = n;
	}
	
	public boolean isPair() {
		if(this.n % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isOdd() {
		if(isPair() == false) {
			return false;
		}
		
		return true;
	}
	
	public boolean isPrime() {
		int divisoes = 0;
		for (int i = 1; i <= n; i++) {
			n /= i;
			divisoes++;
		}
		
		if(divisoes == 2) {
			return true;
		}
		
		return false;
	}
	
	public String printCount() {
		String str = "";
		
		for (int i = 0; i <= n; i++) {
			str += i + " ";
		}
		
		return str;
	}
	
	public String printCountReverse() {
		String str = "";
		
		for (int i = this.n; i >= 0; i--) {
			str += i + " ";
		}
		
		return str;
	}

}
