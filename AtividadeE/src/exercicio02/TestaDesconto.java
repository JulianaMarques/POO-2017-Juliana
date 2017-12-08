package exercicio02;

public class TestaDesconto {
	public static void main(String[] args) {
		Desconto desconto = new Desconto(10,1000);
		
		System.out.println("Valor Original: "+desconto.getValorOriginal());
		System.out.println("Desconto: "+desconto.getDesconto());
		System.out.println("Valor Calculado: "+desconto.calcular());
	}
	
}
