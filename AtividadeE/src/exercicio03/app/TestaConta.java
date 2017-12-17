package app;

import model.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta("123-9", 1000);
		Conta conta2 = new Conta("123-0", 2000);
		
		conta1.sacar(100);
		conta1.depositar(200);
		conta1.transfere(conta2, 900);
		
		conta2.sacar(200);
		conta2.depositar(300);
		conta2.transfere(conta1, 500);
		
		System.out.println("Saldo Conta1: "+conta1.getSaldo());
		System.out.println("Saldo Conta2: "+conta2.getSaldo());

	}

}
