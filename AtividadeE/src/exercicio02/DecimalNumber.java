package exercicio02;

public class DecimalNumber {
	private double decimal;
	
	public DecimalNumber(double decimal) {
		this.decimal = decimal;
	}
	
	public int retornarParteInteira() {
		return (int) decimal;
	}
	
	public int retornarParteDecimal() {		
		return (int) ((decimal - (int) decimal) * 100);
	}

}
