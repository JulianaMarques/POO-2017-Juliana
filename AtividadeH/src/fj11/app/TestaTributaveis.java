package app;

import model.ContaCorrente;
import model.Tributavel;

public class TestaTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(500, "Juliana");
		
		cc.depositar(10);
		
		Tributavel t = cc;
		System.out.println("Valor do Imposto: R$ "+t.getValorImposto());
	}
}
