package capitulo03;

//Q01
public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15_000;
		int gastosFevereiro = 23_000;
		int gastosMarco = 17_000;	
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		//Q03
		double mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Gastos do trimestre: "+gastosTrimestre);
		System.out.println("Media mensal: "+mediaMensal);
	}

}
