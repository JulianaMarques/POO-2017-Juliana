package exercicio02;

public class TestaDecimalNumber {

	public static void main(String[] args) {
		DecimalNumber decimalNumber = new DecimalNumber(3.14);
		
		System.out.println("Parte Inteira: "+decimalNumber.retornarParteInteira());
		System.out.println("Parte Decimal: "+decimalNumber.retornarParteDecimal());

	}

}
