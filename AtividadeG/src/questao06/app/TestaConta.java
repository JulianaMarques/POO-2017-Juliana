package app;

import model.ContaCorrente;
import model.ContaPoupanca;
import model.Pessoa;

public class TestaConta {
		public static void main(String[] args) {
			ContaCorrente cc = new ContaCorrente("123-9", new Pessoa("Juliana","2231","243"), 500.00);
			ContaPoupanca cp = new ContaPoupanca("344-9", new Pessoa("Juliana","65554","343"), 1000.00);
			
			System.out.println(cc.toString());
			System.out.println(cp.toString());
		}
}
