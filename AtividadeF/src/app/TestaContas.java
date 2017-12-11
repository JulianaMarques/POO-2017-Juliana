package app;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(5000);
		Conta cp = new ContaPoupanca(5000);
		
		cc.depositar(1000);
		cp.depositar(1000);
		
		cc.atualizar(0.01);
		cp.atualizar(0.01);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
