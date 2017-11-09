package exercicio01;

//Q09
public class TestaSituacaoFinanceira {

	public static void main(String[] args) {
		SituacaoFinanceira sistuacaoFinanceira = new SituacaoFinanceira();
		
		sistuacaoFinanceira.valorCreditos = 5000;
		sistuacaoFinanceira.valorDebitos = 2000;
		
		System.out.println(sistuacaoFinanceira.saldo());

	}

}
