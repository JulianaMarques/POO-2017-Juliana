package exercicio02;

public class TestaNumberUtils {

	public static void main(String[] args) {
		NumberUtils numberUtils = new NumberUtils(2);
		
		if(numberUtils.isPair()) {
			System.out.println("E Par!");
		}
		
		if(numberUtils.isOdd() == false) {
			System.out.println("E Impar!");
		}
		
		System.out.println("Count: "+numberUtils.printCount());
		System.out.println("Reverse Count: "+numberUtils.printCountReverse());

		if(numberUtils.isPrime()) {
			System.out.println("E Primo!");
		}
		
		else {
			System.out.println("Nao e primo!");
		}
	}

}
