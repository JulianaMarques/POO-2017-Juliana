package app;

import model.ImpostoDeRenda;

public class TestaImpostoDeRenda {

	public static void main(String[] args) {
		ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda(2000);
		
		System.out.println("Renda Bruta: R$ "+impostoDeRenda.getRendaBruta());
		System.out.println("Imposto: R$ "+impostoDeRenda.calcularImposto());
		System.out.println("Renda Liquida: R$ "+impostoDeRenda.calcularRendaLiquida());

	}

}
